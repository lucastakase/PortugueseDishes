package Controller;

import Service.DishesService;

public class MenuRankController extends AbstractController{


    public void setDishesService(DishesService dishesService) {
        this.dishesService = dishesService;
    }

    private DishesService dishesService;

    public void rankDish(int id, int rank){
        dishesService.rank(id, rank);
    }
    public void display(){
        dishesService.displayAllDishes();
    }
}
