package books.client;


import books.client.model.Model;
import books.client.view.View;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BookStack implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        View view = new View();
        RootPanel.get().add(view);

        HandlerManager eventBus = new HandlerManager(null);
        Model model = new Model(eventBus);
        new Presenter(eventBus, view, model);
        model.addTitle("The Art of Computer Programming, Vol. 1");

    }
}
