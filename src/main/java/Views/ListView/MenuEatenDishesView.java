package Views.ListView;

import Controller.ListController.MenuEatenDishesController;
import Views.AbstractView;

public class MenuEatenDishesView extends AbstractView {

    private MenuEatenDishesController menuEatenDishesController;

    public void setMenuEatenDishesController(MenuEatenDishesController menuEatenDishesController) {
        this.menuEatenDishesController = menuEatenDishesController;
    }

    @Override
    public void show() {
        menuEatenDishesController.displayList();
    }
}
