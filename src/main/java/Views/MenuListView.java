package Views;

import Controller.MenuListController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

/**
 * The MenuListView class is responsible for presenting a menu that allows the user
 * to choose different lists of dishes (all, eaten, or not eaten).
 * It interacts with the MenuListController to handle user choices.
 */
public class MenuListView extends AbstractView {

    // Reference to the controller that will handle the business logic
    private MenuListController menuListController;

    // Menu options displayed to the user
    private String[] options = {
            "List All Dishes",
            "List Eaten Dishes",
            "List Not Eaten Dishes"
    };

    /**
     * Sets the MenuListController for this view.
     *
     * @param menuListController the controller instance to handle user input and display logic
     */
    public void setMenuListController(MenuListController menuListController) {
        this.menuListController = menuListController;
    }

    /**
     * Displays the menu to the user and processes their choice.
     * The selected option is passed to the controller for further action.
     */
    @Override
    public void show() {
        // Initialize the scanner with the menu options
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setError("Type a valid number please =D"); // Custom error message for invalid input
        scanner.setMessage("\nChoose an option"); // Prompt message for user input

        // Get the user's choice and pass it to the controller
        menuListController.choosenOption(prompt.getUserInput(scanner));
    }
}
