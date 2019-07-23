package exams.Restaurants;

public class Restaurant implements Comparable<Restaurant> {

    private String name;
    private double coordX;
    private double coordY;
    private double distance;

    public Restaurant(String name, double coordX, double coordY) {
        this.name = name;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getName() {
        return this.name;
    }

    public double getCoordX() {
        return this.coordX;
    }

    public double getCoordY() {
        return this.coordY;
    }

    public void setDistance(double manhattanDistance) {
        this.distance = manhattanDistance;
    }

    public double getDistance() {
        return Double.parseDouble(String.format("%.2f", this.distance));
    }

    @Override
    public String toString() {
        return "Restaurant: " + this.name + ".\t" + "Distance: " + getDistance() + "km.";
    }


    @Override
    public int compareTo(Restaurant o) {
        return (this.getDistance() > o.getDistance()) ? 1 : -1;
    }
}
