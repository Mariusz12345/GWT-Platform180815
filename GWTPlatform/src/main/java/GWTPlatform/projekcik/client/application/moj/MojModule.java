package GWTPlatform.projekcik.client.application.moj;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MojModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(MojPresenter.class, MojPresenter.MyView.class, MojView.class, MojPresenter.MyProxy.class);
    }
}