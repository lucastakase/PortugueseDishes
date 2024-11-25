package Controller;

import Controller.ListController.MenuAllDishesController;
import Controller.ListController.MenuEatenDishesController;
import Controller.ListController.MenuNotEatenDishesController;
import Service.DishesService;

public class MenuListController extends AbstractController {

    private MenuAllDishesController menuAllDishesController;
    private MenuEatenDishesController menuEatenDishesController;
    private MenuNotEatenDishesController menuNotEatenDishesController;

    private DishesService dishesService;

    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void setMenuAllDishesController(MenuAllDishesController menuAllDishesController) {
        this.menuAllDishesController = menuAllDishesController;
    }

    public void setMenuEatenDishesController(MenuEatenDishesController menuEatenDishesController) {
        this.menuEatenDishesController = menuEatenDishesController;
    }

    public void setMenuNotEatenDishesController(MenuNotEatenDishesController menuNotEatenDishesController) {
        this.menuNotEatenDishesController = menuNotEatenDishesController;
    }

    public void choosenOption(int option) {

        switch (option) {
            case 1:
                System.out.println("\nYou Choose -List All Dishes-");
                menuAllDishesController.init();
                break;
            case 2:
                System.out.println("\nYou Choose -List Eaten Dishes-");
                menuEatenDishesController.init();
                break;
            case 3:
                System.out.println("\nYou Choose -List Not Eaten Dishes-");
                menuNotEatenDishesController.init();
                break;
            default:
                init();
                break;
        }
    }
}

