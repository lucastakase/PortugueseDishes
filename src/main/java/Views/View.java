package Views;

/**
 * The View interface represents a generic contract for all view components.
 * Any class implementing this interface must provide an implementation for the show() method,
 * which is responsible for displaying the content or interface to the user.
 */
public interface View {

    /**
     * Displays the view's content or user interface.
     * Implementing classes should define what is shown when this method is called.
     */
    void show();
}
