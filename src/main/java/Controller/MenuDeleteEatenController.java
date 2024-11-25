package Controller;

import Service.DishesService;

public class MenuDeleteEatenController extends AbstractController{
    private DishesService dishesService;


    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void delete(int id){
        dishesService.delete(id);
    }
    public void display(){
        dishesService.displayAllDishes();
    }
}
