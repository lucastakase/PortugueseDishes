package Controller.ListController;

import Controller.AbstractController;
import Service.DishesService;

public class MenuAllDishesController extends AbstractController {
    private DishesService dishesService;



    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void displayList(){
        dishesService.displayAllDishes();
    }
}
