package Views;

import Controller.MenuDeleteEatenController;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class MenuDeleteEatenView extends AbstractView{
    private MenuDeleteEatenController menuDeleteEatenController;

    public void setMenuDeleteEatenController(MenuDeleteEatenController menuDeleteEatenController) {
        this.menuDeleteEatenController = menuDeleteEatenController;
    }

    @Override
    public void show() {
        menuDeleteEatenController.display();
        IntegerInputScanner scanner = new IntegerInputScanner();
        scanner.setError("Type a valid number please =D");
        scanner.setMessage("\nChoose the ID of the dish to delete: ");
        menuDeleteEatenController.delete(prompt.getUserInput(scanner));
    }
}
