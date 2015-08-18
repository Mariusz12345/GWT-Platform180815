package GWTPlatform.projekcik.client.application.moj.presenterwidget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
public class PresenterWidgetPresenter extends PresenterWidget<PresenterWidgetPresenter.MyView>  {
    interface MyView extends View  {
    	public Button getTakB();
    	public Button getNieB();
    }

    @Inject
    PresenterWidgetPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        
    }
    
    protected void onBind() {
        super.onBind();
        getView().getTakB().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To jest wspaniala strona");
			}
		});
        getView().getNieB().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Moglo byc gorzej");
			}
		});
    }
    
}