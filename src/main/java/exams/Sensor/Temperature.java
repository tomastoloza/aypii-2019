package exams.Sensor;

public class Temperature extends Sensor {
    public Temperature(double thereshold) {
        super(thereshold);
    }

    @Override
    protected String getType() {
        return "Temperature";
    }
}
