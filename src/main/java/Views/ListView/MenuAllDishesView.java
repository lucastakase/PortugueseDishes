package Views.ListView;

import Controller.ListController.MenuAllDishesController;
import Views.AbstractView;

public class MenuAllDishesView extends AbstractView {

    private MenuAllDishesController menuAllDishesController;

    public void setMenuAllDishesController(MenuAllDishesController menuAllDishesController) {
        this.menuAllDishesController = menuAllDishesController;
    }

    @Override
    public void show() {
        menuAllDishesController.displayList();
    }
}
