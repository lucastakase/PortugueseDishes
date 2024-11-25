package Controller;

import Service.DishesService;
import Views.View;

public abstract class AbstractController implements Controller{
     protected View view;
     private Controller controler;

    public void setControler(Controller controler) {
        this.controler = controler;
    }

    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void init(){
        view.show();
    }
}
