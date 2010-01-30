/**
 * 
 */
package books.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public final class BookPanelImpl extends Composite implements BookPanel {

    interface Binder extends UiBinder<Widget, BookPanelImpl> {}
    private static final Binder uiBinder = GWT.create(Binder.class);

    @UiField
	Image upButton;

    @UiField
	Image removeButton;

    @UiField(provided = true)
	Label label;

    public BookPanelImpl(String title) {
		label = new Label(title);

        initWidget(uiBinder.createAndBindUi(this));
	}

	public HasClickHandlers getUpButton() {
		return upButton;
	}

	public HasClickHandlers getRemoveButton() {
		return removeButton;
	}

	public HasText getLabel() {
		return label;
	}
	

}