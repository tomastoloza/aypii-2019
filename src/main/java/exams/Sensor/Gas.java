package exams.Sensor;

public class Gas extends Sensor {
    public Gas(double thereshold) {
        super(thereshold);
    }

    @Override
    protected String getType() {
        return "Gas";
    }

}
