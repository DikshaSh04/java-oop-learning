package oop.polymorphism.runtimePolymorphism.homeAlertSystem;

public class Main {
    public static void main(String[] args) {
        Sensor[] sensors = {
                new SmokeSensor("Kitchen"),
                new MotionSensor("Front Door"),
                new GasSensor("Basement")
        };

        for(Sensor s : sensors) {
            System.out.println(s.triggerAlert());
        }

    }
}
