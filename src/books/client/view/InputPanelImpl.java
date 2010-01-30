/**
 * 
 */
package books.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public class InputPanelImpl extends Composite implements InputPanel {
    interface Binder extends UiBinder<Widget, InputPanelImpl> {}
    private static final Binder uiBinder = GWT.create(Binder.class);

    @UiField
    SuggestBox addBox;
    @UiField
	Button addButton;

    public InputPanelImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        this.setStylePrimaryName("inputPanel");
	}
	
	public HasClickHandlers getAddButton() {
		return addButton;
	}

	public HasText getAddBox() {
		return addBox;
	}
}