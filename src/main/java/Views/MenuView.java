package Views;

import Controller.MenuController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

/**
 * The MenuView class is responsible for displaying the main menu to the user.
 * It extends AbstractView and uses the MenuInputScanner to capture and handle user input.
 */
public class MenuView extends AbstractView {

    // Reference to the MenuController for handling user interactions
    private MenuController menuController;

    // Menu options available for the user
    private String[] options = {
            "List Dishes",
            "Add Dishes",
            "Rank Eaten Dishes",
            "Delete Dishes",
            "Delete Eaten Dishes",
            "Exit"
    };

    /**
     * Sets the MenuController for this view.
     * @param menuController the MenuController instance to handle user input
     */
    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    /**
     * Displays the menu to the user and processes their choice.
     * It utilizes MenuInputScanner to ensure valid input and delegates the selected option
     * to the MenuController.
     */
    @Override
    public void show() {
        System.out.println("\nPORTUGUESE DISHES");  // Display the menu title

        // Initialize a scanner with the menu options
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setError("Type a valid number please =D");  // Error message for invalid input
        scanner.setMessage("\nChoose an option");  // Prompt message for user input

        // Get the user's choice and pass it to the controller
        menuController.choosenOption(prompt.getUserInput(scanner));
    }
}
