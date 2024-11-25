package Controller;

import Controller.AbstractController;
import Service.DishesService;

public class MenuAddController extends AbstractController {

    private DishesService dishesService;


    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void add(String dishName){
        dishesService.addDish(dishName);
    }
    public void display(){
        dishesService.displayAllDishes();
    }
}
