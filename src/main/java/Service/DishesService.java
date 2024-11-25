package Service;

import DAO.DishesDAO;
import Managers.TransactionManager;

import java.sql.SQLException;

public class DishesService {
    private TransactionManager transactionManager;
    private DishesDAO dishesDAO;

    public void setDishesDAO(DishesDAO dishesDAO) {
        this.dishesDAO = dishesDAO;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void displayAllDishes() {
        try {
            transactionManager.beginRead();
            dishesDAO.displayAllDishes();
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void displayEatenDishes() {
        try {
            transactionManager.beginRead();
            dishesDAO.displaySomeDishes(1);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void displayNotEatenDishes() {
        try {
            transactionManager.beginRead();
            dishesDAO.displaySomeDishes(2);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void addDish(String dishName) {
        try {
            transactionManager.beginRead();
            dishesDAO.add(dishName);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void deleteRank(int id) {
        try {
            transactionManager.beginRead();
            dishesDAO.deleteRank(id);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        try {
            transactionManager.beginRead();
            dishesDAO.delete(id);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }

    public void rank(int id, int rank) {
        try {
            transactionManager.beginRead();
            dishesDAO.rankDish(id, rank);
            transactionManager.commit();
        } catch (SQLException e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }
}
