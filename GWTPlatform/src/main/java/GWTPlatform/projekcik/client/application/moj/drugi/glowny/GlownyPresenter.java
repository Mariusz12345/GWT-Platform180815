package GWTPlatform.projekcik.client.application.moj.drugi.glowny;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.HasUiHandlers;
public class GlownyPresenter extends Presenter<GlownyPresenter.MyView, GlownyPresenter.MyProxy> implements GlownyUiHandlers {
    interface MyView extends View , HasUiHandlers<GlownyUiHandlers> {
    }
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_Glowny = new Type<RevealContentHandler<?>>();

    
    @ProxyStandard
    interface MyProxy extends Proxy<GlownyPresenter> {
    }

    @Inject
    GlownyPresenter(
            EventBus eventBus,
            MyView view, 
            MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
        
        getView().setUiHandlers(this);
    }
    
    protected void onBind() {
        super.onBind();
    }
    
}