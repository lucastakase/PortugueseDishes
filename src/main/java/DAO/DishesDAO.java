package DAO;

import Managers.ConnectionManager;
import Model.Dish;

import java.lang.invoke.SwitchPoint;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DishesDAO {

    private ConnectionManager connectionManager;

    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public Dish get(Integer id) throws SQLException {

        Dish dish = new Dish();
        String query = "SELECT * FROM dishes WHERE dish_id = ?";
        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            dish.setId(id);
            dish.setName(resultSet.getString("dish_name"));
        }
        statement.close();
        return dish;
    }

    public void displayAllDishes() throws SQLException {
        System.out.println("Dishes:");
        String query = "SELECT * FROM dishes";
        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("dish_id") + ": " + resultSet.getString("dish_name"));
        }
        System.out.println("\n");
    }

    public void displaySomeDishes(int option) throws SQLException {
        switch (option) {
            case 1:
                System.out.println("Dishes:");
                String query = "SELECT dishes.dish_id, eaten_dishes.id, dishes.dish_name, eaten_dishes.rank_dish," + " eaten_dishes.eat_day FROM dishes LEFT JOIN eaten_dishes" + " ON dishes.dish_id = eaten_dishes.dish_id" + " WHERE eaten_dishes.dish_id IS NOT NULL";
                PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    System.out.println("\n" + "\nID: " + resultSet.getInt("id") + "\nName: " + resultSet.getString("dish_name") + "\nRank: " + resultSet.getInt("rank_dish") + "\nDate: " + resultSet.getDate("eat_day") + "\n");
                }
                break;
            case 2:
                System.out.println("Dishes:");
                String query1 = "SELECT dishes.dish_id, dishes.dish_name FROM dishes LEFT JOIN eaten_dishes" + " ON dishes.dish_id = eaten_dishes.dish_id" + " WHERE eaten_dishes.dish_id IS NULL";
                PreparedStatement statement1 = connectionManager.getCurrentConnection().prepareStatement(query1);
                ResultSet resultSet1 = statement1.executeQuery();

                while (resultSet1.next()) {
                    System.out.println(resultSet1.getInt("dish_id") + ": " + resultSet1.getString("dish_name"));
                }
                break;
        }
    }

    public void add(String dishName) throws SQLException {
        /*String query = "SELECT * FROM dishes";
        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            if(dishName.equals(resultSet.getString("dish_name"))){
                System.out.println("It's not allowed to add the same dish, add another one!");
                return;
            };
        }*/
        String query1 = "INSERT INTO dishes(dish_name) " + "VALUES(?)";

        PreparedStatement statement1 = connectionManager.getCurrentConnection().prepareStatement(query1);

        statement1.setString(1, dishName);

        statement1.executeUpdate();
    }

    public void rankDish(int id, int rank) throws SQLException {
        String query = "INSERT INTO eaten_dishes(dish_id, rank_dish, eat_day) " + "VALUES(?, ?, CURRENT_DATE)";

        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);

        statement.setInt(1, id);
        statement.setInt(2, rank);

        statement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM dishes WHERE dish_id = ?";

        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);

        statement.setInt(1, id);
        statement.executeUpdate();

    }

    public void deleteRank(int id) throws SQLException {
        String query = "DELETE FROM eaten_dishes WHERE id = ?";

        PreparedStatement statement = connectionManager.getCurrentConnection().prepareStatement(query);

        statement.setInt(1, id);
        statement.executeUpdate();
    }


}