package Controller;

import Service.DishesService;

public class MenuDeleteNoEatenController extends AbstractController{

    private DishesService dishesService;


    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    public void delete(int id){
        dishesService.deleteRank(id);
    }
    public void display(){
        dishesService.displayEatenDishes();
    }
}
