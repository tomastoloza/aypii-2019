import java.nio.charset.Charset;
import java.util.ArrayList;

public class Remisse {


    private ArrayList<String> trips = new ArrayList<>();

    public ArrayList<String> list(){
        return this.trips;
    }

    public void addTrip(String car, int distance, String origin) {
        this.trips.add((" Car: " + car + " Distance: " + distance + " Origin: " + origin + " Price: $" + getTripPrice(distance)));
    }

    public void addDelivery(String car, int distance, String origin, int packages) {
        this.trips.add((" Car: " + car + " Distance: " + distance + " Origin: " + origin + " Quantity: "+packages+" Price: $" + getDeliveryPrice(distance,packages)));
    }

    private int getTripPrice(int distance) {
        return (5 + distance / 200 * 2);
    }

    private int getDeliveryPrice(int distance, int packages) {
        return (5 + (distance / 200 * packages));
    }

    public static void main(String[] args) {

//        Remisse remis = new Remisse();
//        remis.addDelivery("1GV34", 220, "Siempre viva 213", 5);
//        remis.addTrip("1GV34", 432, "Siempre viva 213");
//        System.out.println("remis.list() = " + remis.list());

    }

}
