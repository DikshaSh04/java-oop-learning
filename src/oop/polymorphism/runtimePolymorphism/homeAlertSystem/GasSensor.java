package oop.polymorphism.runtimePolymorphism.homeAlertSystem;

public class GasSensor extends Sensor{
    GasSensor(String location) {
        super(location);
    }

    @Override
    String triggerAlert(){
        return "Gas leak at "+getLocation()+"! Turn off appliances immediately.";
    }
}
