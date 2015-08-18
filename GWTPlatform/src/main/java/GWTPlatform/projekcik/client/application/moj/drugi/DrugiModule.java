package GWTPlatform.projekcik.client.application.moj.drugi;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import GWTPlatform.projekcik.client.application.moj.drugi.glowny.GlownyModule;
import GWTPlatform.projekcik.client.application.moj.drugi.trzeci.TrzeciModule;

public class DrugiModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new TrzeciModule());
		install(new GlownyModule());
		bindPresenter(DrugiPresenter.class, DrugiPresenter.MyView.class, DrugiView.class, DrugiPresenter.MyProxy.class);
    }
}