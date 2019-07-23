package exams.Restaurants;

import java.util.ArrayList;
import java.util.TreeSet;

public class Sorter {

    public TreeSet<Restaurant> sortRestaurantsByDistance(double yourLocationX, double yourLocationY, ArrayList<Restaurant> restaurants) {
        TreeSet<Restaurant> sortedRestaurants = new TreeSet<>();
        for (Restaurant restaurant : restaurants) {
            restaurant.setDistance(getManhattanDistance(yourLocationX, yourLocationY, restaurant.getCoordX(), restaurant.getCoordY()));
            sortedRestaurants.add(restaurant);
        }
        return sortedRestaurants;
    }


    private double getManhattanDistance(double firstX, double firstY, double secondX, double secondY) {
        return Math.abs(firstX - firstY) + Math.abs(secondX - secondY);
    }

    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("caquita", 2.4, -1.2));
        restaurants.add(new Restaurant("Falopa1", 3.4, 3.2));
        restaurants.add(new Restaurant("Le nicanor", -12.4, 11.2));
        System.out.println(new Sorter().sortRestaurantsByDistance(2.3, -0.3, restaurants));;
    }
}
