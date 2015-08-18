package GWTPlatform.projekcik.client.application.moj.drugi;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DrugiModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DrugiPresenter.class, DrugiPresenter.MyView.class, DrugiView.class, DrugiPresenter.MyProxy.class);
    }
}