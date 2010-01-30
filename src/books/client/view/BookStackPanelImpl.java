package books.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class BookStackPanelImpl extends Composite implements BookStackPanel {

    interface Binder extends UiBinder<Widget, BookStackPanelImpl> {}
    private static final Binder uiBinder = GWT.create(Binder.class);

    @UiField
    VerticalPanel container = new VerticalPanel();

    public BookStackPanelImpl() {
        initWidget(uiBinder.createAndBindUi(this));

        this.setStylePrimaryName("stackPanel");
    }

    public BookPanel addBookPanel(String title) {
		BookPanelImpl bookPanel = new BookPanelImpl(title);
		container.add(bookPanel);
		return bookPanel;
	}

    public void clear() {
        container.clear();
    }

}
