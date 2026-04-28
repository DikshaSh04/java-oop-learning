package oop.polymorphism.runtimePolymorphism.homeAlertSystem;

public class SmokeSensor extends Sensor{
    SmokeSensor(String location) {
        super(location);
    }

    @Override
    String triggerAlert(){
        return "Smoke detected at "+getLocation()+"! Evacuate immediately.";
    }
}
