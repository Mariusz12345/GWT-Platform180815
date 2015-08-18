package GWTPlatform.projekcik.client.application.moj;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class MojView extends ViewImpl implements MojPresenter.MyView {
    interface Binder extends UiBinder<Widget, MojView> {
    }

   @UiField Label pierszTekst;
   @UiField TextBox pierwszyBox;
   @UiField Button pierwszyPrzycisk;

    @Inject
    MojView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

	public Label getPierszTekst() {
		return pierszTekst;
	}

	public void setPierszTekst(Label pierszTekst) {
		this.pierszTekst = pierszTekst;
	}

	public TextBox getPierwszyBox() {
		return pierwszyBox;
	}

	public void setPierwszyBox(TextBox pierwszyBox) {
		this.pierwszyBox = pierwszyBox;
	}

	public Button getPierwszyPrzycisk() {
		return pierwszyPrzycisk;
	}

	public void setPierwszyPrzycisk(Button pierwszyPrzycisk) {
		this.pierwszyPrzycisk = pierwszyPrzycisk;
	}
    
    
    
   
}