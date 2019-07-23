package exams.Sensor;

import java.util.ArrayList;

public class SensorSystem {
    private ArrayList<Sensor> sensors = new ArrayList<>();

    public void getReadings() {
        for (Sensor sensor : sensors) {
            sensor.getSample();
            if (sensor.getLastSample() > sensor.getThereshold()) {
                System.out.println(sensor);
            }

        }
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }


    public static void main(String[] args) {
        SensorSystem sensorSystem = new SensorSystem();
        Gas sensor = new Gas(20);
        sensor.switchStatus();
        sensorSystem.addSensor(sensor);
        Gas sensor1 = new Gas(102);
        sensor1.switchStatus();
        sensorSystem.addSensor(sensor1);
        Temperature sensor2 = new Temperature(40);
        sensor2.switchStatus();
        sensorSystem.addSensor(sensor2);
        sensorSystem.addSensor(new Temperature(2));
        sensorSystem.getReadings();
    }
}
