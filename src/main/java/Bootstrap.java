import Controller.*;
import Controller.ListController.MenuAllDishesController;
import Controller.ListController.MenuEatenDishesController;
import Controller.ListController.MenuNotEatenDishesController;
import DAO.DishesDAO;
import Managers.ConnectionManager;
import Managers.TransactionManager;
import Service.DishesService;
import Views.*;
import Views.ListView.MenuAllDishesView;
import Views.ListView.MenuEatenDishesView;
import Views.ListView.MenuNotEatenDishesView;
import org.academiadecodigo.bootcamp.Prompt;

public class Bootstrap {

    public void wiringStart() {
        // Initialize a prompt for user interaction
        Prompt prompt = new Prompt(System.in, System.out);

        // Initialize Managers for database connection and transaction handling
        ConnectionManager connectionManager = new ConnectionManager();
        TransactionManager transactionManager = new TransactionManager();
        transactionManager.setConnectionManager(connectionManager);  // Link transaction manager to connection manager

        // Initialize the Service layer
        DishesService dishesService = new DishesService();

        // Initialize Data Access Object (DAO) for dishes
        DishesDAO dishesDAO = new DishesDAO();

        // Initialize various Views and Controllers for different menu functionalities
        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController();

        MenuRankView menuRankView = new MenuRankView();
        MenuRankController menuRankController = new MenuRankController();

        MenuListView menuListView = new MenuListView();
        MenuListController menuListController = new MenuListController();

        MenuDeleteEatenView menuDeleteEatenView = new MenuDeleteEatenView();
        MenuDeleteEatenController menuDeleteEatenController = new MenuDeleteEatenController();

        MenuDeleteNotEatenView menuDeleteNotEatenView = new MenuDeleteNotEatenView();
        MenuDeleteNoEatenController menuDeleteNoEatenController = new MenuDeleteNoEatenController();

        MenuAddView menuAddView = new MenuAddView();
        MenuAddController menuAddController = new MenuAddController();

        MenuAllDishesView menuAllDishesView = new MenuAllDishesView();
        MenuAllDishesController menuAllDishesController = new MenuAllDishesController();

        MenuEatenDishesView menuEatenDishesView = new MenuEatenDishesView();
        MenuEatenDishesController menuEatenDishesController = new MenuEatenDishesController();

        MenuNotEatenDishesView menuNotEatenDishesView = new MenuNotEatenDishesView();
        MenuNotEatenDishesController menuNotEatenDishesController = new MenuNotEatenDishesController();

        // Wire up the dependencies between layers

        // Set up DAO with the connection manager
        dishesDAO.setConnectionManager(connectionManager);

        // Link Service to DAO and Transaction Manager
        dishesService.setDishesDAO(dishesDAO);
        dishesService.setTransactionManager(transactionManager);

        // Set up Views with their corresponding Controllers and the prompt for user interaction
        menuView.setMenuController(menuController);
        menuView.setPrompt(prompt);
        menuRankView.setMenuRankController(menuRankController);
        menuRankView.setPrompt(prompt);
        menuListView.setMenuListController(menuListController);
        menuListView.setPrompt(prompt);
        menuDeleteNotEatenView.setMenuDeleteNoEatenController(menuDeleteNoEatenController);
        menuDeleteNotEatenView.setPrompt(prompt);
        menuDeleteEatenView.setMenuDeleteEatenController(menuDeleteEatenController);
        menuDeleteEatenView.setPrompt(prompt);
        menuAddView.setMenuAddController(menuAddController);
        menuAddView.setPrompt(prompt);
        menuNotEatenDishesView.setMenuNotEatenDishesController(menuNotEatenDishesController);
        menuNotEatenDishesView.setPrompt(prompt);
        menuEatenDishesView.setMenuEatenDishesController(menuEatenDishesController);
        menuEatenDishesView.setPrompt(prompt);
        menuAllDishesView.setMenuAllDishesController(menuAllDishesController);

        // Set up Controllers with their respective Views and Services
        menuController.setMenuAddController(menuAddController);
        menuController.setMenuDeleteEatenController(menuDeleteEatenController);
        menuController.setMenuListController(menuListController);
        menuController.setMenuRankController(menuRankController);
        menuController.setMenuDeleteNoEatenController(menuDeleteNoEatenController);
        menuController.setDishesService(dishesService);
        menuController.setView(menuView);

        menuRankController.setDishesService(dishesService);
        menuRankController.setView(menuRankView);

        menuListController.setControler(menuAllDishesController);
        menuListController.setMenuEatenDishesController(menuEatenDishesController);
        menuListController.setMenuNotEatenDishesController(menuNotEatenDishesController);
        menuListController.setDishesService(dishesService);
        menuListController.setView(menuListView);
        menuListController.setMenuAllDishesController(menuAllDishesController);

        menuDeleteNoEatenController.setDishesService(dishesService);
        menuDeleteNoEatenController.setView(menuDeleteNotEatenView);

        menuDeleteEatenController.setDishesService(dishesService);
        menuDeleteEatenController.setView(menuDeleteEatenView);

        menuAddController.setDishesService(dishesService);
        menuAddController.setView(menuAddView);

        menuNotEatenDishesController.setDishesService(dishesService);
        menuNotEatenDishesController.setView(menuNotEatenDishesView);

        menuEatenDishesController.setDishesService(dishesService);
        menuEatenDishesController.setView(menuEatenDishesView);

        menuAllDishesController.setDishesService(dishesService);
        menuAllDishesController.setView(menuAllDishesView);

        // Start the main application menu
        menuController.init();  // Entry point for the user interaction loop
    }
}
