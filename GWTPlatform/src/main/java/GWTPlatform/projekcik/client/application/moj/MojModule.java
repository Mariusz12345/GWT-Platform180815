package GWTPlatform.projekcik.client.application.moj;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import GWTPlatform.projekcik.client.application.moj.drugi.DrugiModule;

public class MojModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
		install(new DrugiModule());
		bindPresenter(MojPresenter.class, MojPresenter.MyView.class, MojView.class, MojPresenter.MyProxy.class);
    }
}