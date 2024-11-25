package Views;

import Controller.MenuRankController;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

/**
 * The MenuRankView class is responsible for displaying the ranking interface to the user.
 * It allows the user to select a dish by ID and provide a ranking score.
 */
public class MenuRankView extends AbstractView {

    // Reference to the MenuRankController for handling dish ranking logic
    private MenuRankController menuRankController;

    /**
     * Sets the MenuRankController for this view.
     *
     * @param menuRankController the controller instance to handle user input and business logic
     */
    public void setMenuRankController(MenuRankController menuRankController) {
        this.menuRankController = menuRankController;
    }

    /**
     * Displays the ranking menu and captures user input for dish selection and ranking.
     * The inputs are passed to the controller for processing.
     */
    @Override
    public void show() {
        // Display the list of dishes or relevant information through the controller
        menuRankController.display();

        // Prompt the user to choose a dish by its ID
        IntegerInputScanner scanner = new IntegerInputScanner();
        scanner.setError("Type a valid number please =D");  // Custom error message for invalid input
        scanner.setMessage("\nChoose the ID of your dish: ");  // Prompt message for dish selection

        int dishId = prompt.getUserInput(scanner);  // Capture the dish ID from the user

        // Prompt the user to provide a rank for the selected dish
        IntegerInputScanner rankScanner = new IntegerInputScanner();
        rankScanner.setError("Type a valid number please =D");  // Error message for invalid input
        rankScanner.setMessage("\nGive me the rank: ");  // Prompt message for dish ranking

        int rank = prompt.getUserInput(rankScanner);  // Capture the ranking value from the user

        // Pass the dish ID and rank to the controller for further processing
        menuRankController.rankDish(dishId, rank);
    }
}
