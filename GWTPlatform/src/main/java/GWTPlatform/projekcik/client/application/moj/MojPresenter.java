package GWTPlatform.projekcik.client.application.moj;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTPlatform.projekcik.client.place.NameTokens;
public class MojPresenter extends Presenter<MojPresenter.MyView, MojPresenter.MyProxy>  {
    interface MyView extends View  {
    	
    	public Label getPierszTekst();
    	public TextBox getPierwszyBox();
    	public Button getPierwszyPrzycisk();
    	public TextBox getDrugiBox();
    	public TextBox getTrzeciBox();
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_Moj = new Type<RevealContentHandler<?>>();

    @NameToken(NameTokens.first)
    @ProxyCodeSplit
    interface MyProxy extends ProxyPlace<MojPresenter> {
    }

    @Inject
    MojPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
    }
    
    protected void onBind() {
        super.onBind();
    }
    
   @Inject
    PlaceManager placeMenager;
    
    protected void onReset(){
    	super.onReset();
    	// w presenterze ustawiamy wartosc boxa
    	getView().getPierwszyBox().setText("Podaj imie klienta");
    	getView().getDrugiBox().setText("Podaj nazwisko klienta");
    	getView().getTrzeciBox().setText("Podaj pesel klienta");
    	
    	getView().getPierwszyPrzycisk().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				PlaceRequest request = new PlaceRequest(NameTokens.drugi).with("name", getView().getPierwszyBox().getText());
				PlaceRequest request2 = new PlaceRequest(NameTokens.drugi).with("name", getView().getDrugiBox().getText());
				placeMenager.revealPlace(request);
			}
		});
    }
    
}