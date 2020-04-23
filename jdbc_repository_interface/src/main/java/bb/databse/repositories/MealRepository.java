package bb.databse.repositories;

import bb.databse.DatabaseConnector;
import bb.databse.models.Meal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MealRepository implements Repository<Meal> {
    private DatabaseConnector connector;

    public MealRepository() {
        this.connector = DatabaseConnector.getInstance();
    }
    public List<Meal> findAll() {
        List<Meal> meals = new ArrayList<Meal>();
        ResultSet result = connector.fetchData("SELECT * FROM meals");
        if (result == null) {
            System.out.println("could not fetch cars");
            return null;
        }

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                double price = result.getDouble("price");

                meals.add(new Meal(id, name, price));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return meals;
        }

    }

    public Meal findOne(int id) {
        Meal resultMeal = null;
        ResultSet result = connector.fetchData("SELECT * FROM meals WHERE id=" + id);
        if (result == null) {
            System.out.println("could not fetch cars");
            return null;
        }

        try {
            while (result.next()) {
                String name = result.getString("name");
                double price = result.getDouble("price");

                resultMeal = new Meal(id, name, price);
            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return resultMeal;
        }
    }

    public void create(Meal entity) {
        String sql = "INSERT INTO `meal`.`meals` (`name`, `price`) VALUES ('" + entity.getName() + "','"+ entity.getPrice() +"');";
        connector.insert(sql); ;
    }
}
