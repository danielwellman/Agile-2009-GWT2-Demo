package books.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class View extends Composite {
    interface Binder extends UiBinder<Widget, View> {}
    private static final Binder uiBinder = GWT.create(Binder.class);

    @UiField
    BookStackPanelImpl stackPanel;
    @UiField
    InputPanelImpl inputPanel;

    public View() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public BookStackPanel getStackPanel() {
        return stackPanel;
    }

    public InputPanel getInputPanel() {
        return inputPanel;
    }

}
