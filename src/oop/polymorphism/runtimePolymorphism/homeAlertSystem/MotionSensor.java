package oop.polymorphism.runtimePolymorphism.homeAlertSystem;

public class MotionSensor extends Sensor{
    MotionSensor(String location) {
        super(location);
    }

    @Override
    String triggerAlert(){
        return "Unauthorised motion detected at "+getLocation()+"! Notifying security.";
    }
}
