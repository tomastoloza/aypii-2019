package exams.Sensor;

import java.util.Random;

public abstract class Sensor {
    private double thereshold = 0;
    private double lastSample = 0;
    private String location;
    private boolean status = false;

    public Sensor(double thereshold) {
        this.thereshold = thereshold;
    }

    public void getSample() {
        if (isEnabled())
            this.lastSample = new Random().nextInt(99);
        else {
            System.out.println("The sensor is disabled");
        }
    }

    public double getLastSample() {
        return lastSample;
    }

    public boolean isEnabled() {
        return status;
    }

    public void switchStatus() {
        status = !isEnabled();
    }

    public double getThereshold() {
        return thereshold;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return getType() + " sensor.\nThereshold: " + getThereshold() + "\nCurrent sample: " + getLastSample() + "\nLocation: " + getLocation() + "\n";
    }

    protected abstract String getType();
}
