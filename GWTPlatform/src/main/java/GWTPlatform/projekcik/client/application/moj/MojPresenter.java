package GWTPlatform.projekcik.client.application.moj;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import GWTPlatform.projekcik.client.place.NameTokens;
public class MojPresenter extends Presenter<MojPresenter.MyView, MojPresenter.MyProxy>  {
    interface MyView extends View  {
    	
    	public Label getPierszTekst();
    	public TextBox getPierwszyBox();
    	public Button getPierwszyPrzycisk();
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
    
    protected void onReset(){
    	super.onReset();
    	getView().getPierwszyBox().setText("Pierwszy wpis");
    }
    
}