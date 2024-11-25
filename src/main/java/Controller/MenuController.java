package Controller;

import Controller.ListController.MenuEatenDishesController;
import Controller.ListController.MenuNotEatenDishesController;
import Service.DishesService;

public class MenuController extends AbstractController{
    MenuAddController menuAddController;
    MenuListController menuListController;
    MenuRankController menuRankController;
    MenuDeleteNoEatenController menuDeleteNoEatenController;
    MenuDeleteEatenController menuDeleteEatenController;

    DishesService dishesService;

    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void setMenuAddController(MenuAddController menuAddController) {
        this.menuAddController = menuAddController;
    }

    public void setMenuListController(MenuListController menuListController) {
        this.menuListController = menuListController;
    }

    public void setMenuRankController(MenuRankController menuRankController) {
        this.menuRankController = menuRankController;
    }

    public void setMenuDeleteNoEatenController(MenuDeleteNoEatenController menuDeleteNoEatenController) {
        this.menuDeleteNoEatenController = menuDeleteNoEatenController;
    }

    public void setMenuDeleteEatenController(MenuDeleteEatenController menuDeleteEatenController) {
        this.menuDeleteEatenController = menuDeleteEatenController;
    }

    public void choosenOption(int option){

        switch (option){
            case 1:
                System.out.println("\nYou Choose -List Dishes-");
                menuListController.init();
                break;
            case 2:
                System.out.println("\nYou Choose -Add Dishes-");
                menuAddController.init();
                break;
            case 3:
                System.out.println("\nYou Choose -Rank Eaten Dishes-");
                menuRankController.init();
                break;
            case 4:
                System.out.println("\nYou Choose -Delete Dishes-");
                menuDeleteEatenController.init();
                break;
            case 5:
                System.out.println("\nYou Choose -Delete Eaten Dishes-");
                menuDeleteNoEatenController.init();
                break;
            case 6:
                System.out.println("\nBye bye, see you later! =D");
                System.exit(0);
                break;
            default:
                init();
                break;
        }
        init();
    }
}
