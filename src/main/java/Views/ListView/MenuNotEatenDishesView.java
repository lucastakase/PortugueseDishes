package Views.ListView;

import Controller.ListController.MenuNotEatenDishesController;
import Views.AbstractView;

public class MenuNotEatenDishesView extends AbstractView {

    private MenuNotEatenDishesController menuNotEatenDishesController;

    public void setMenuNotEatenDishesController(MenuNotEatenDishesController menuNotEatenDishesController) {
        this.menuNotEatenDishesController = menuNotEatenDishesController;
    }

    @Override
    public void show() {
        menuNotEatenDishesController.displayList();
    }
}
