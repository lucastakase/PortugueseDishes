package Controller.ListController;

import Controller.AbstractController;
import Service.DishesService;

public class MenuNotEatenDishesController extends AbstractController {

    private DishesService dishesService;

    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }
    public void displayList(){
        dishesService.displayNotEatenDishes();
    }
}
