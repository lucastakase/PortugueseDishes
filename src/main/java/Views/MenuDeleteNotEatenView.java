package Views;

import Controller.MenuDeleteNoEatenController;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

/**
 * The MenuDeleteNotEatenView class is responsible for presenting the deletion interface
 * for dishes that have not been eaten. It collects user input and delegates the deletion
 * process to the MenuDeleteNoEatenController.
 */
public class MenuDeleteNotEatenView extends AbstractView {

    // Reference to the controller that handles deletion logic for not-eaten dishes
    private MenuDeleteNoEatenController menuDeleteNoEatenController;

    /**
     * Sets the MenuDeleteNoEatenController for this view.
     *
     * @param menuDeleteNoEatenController the controller responsible for handling deletion
     */
    public void setMenuDeleteNoEatenController(MenuDeleteNoEatenController menuDeleteNoEatenController) {
        this.menuDeleteNoEatenController = menuDeleteNoEatenController;
    }

    /**
     * Displays the list of not-eaten dishes and prompts the user to select one for deletion.
     * The selected dish ID is passed to the controller for processing.
     */
    @Override
    public void show() {
        // Display the list of not-eaten dishes through the controller
        menuDeleteNoEatenController.display();

        // Initialize the scanner to capture the dish ID from the user
        IntegerInputScanner scanner = new IntegerInputScanner();
        scanner.setError("Type a valid number please =D");  // Custom error message for invalid input
        scanner.setMessage("\nChoose the ID of the dish to delete: ");  // Prompt message

        // Get the user's input and pass it to the controller for deletion
        menuDeleteNoEatenController.delete(prompt.getUserInput(scanner));
    }
}
