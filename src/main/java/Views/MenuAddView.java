package Views;

import Controller.MenuAddController;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class MenuAddView extends AbstractView{

    private MenuAddController menuAddController;

    public void setMenuAddController(MenuAddController menuAddController) {
        this.menuAddController = menuAddController;
    }

    @Override
    public void show() {
        menuAddController.display();
        StringInputScanner scanner = new StringInputScanner();
        scanner.setError("Type a valid name please =D");
        scanner.setMessage("\nAdd the name of the dish: ");
        menuAddController.add(prompt.getUserInput(scanner));
    }
}
