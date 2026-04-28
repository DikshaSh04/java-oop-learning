package oop.polymorphism.runtimePolymorphism.homeAlertSystem;

public class Sensor {
    private String location;

    Sensor(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }

    String triggerAlert(){
        return "Alert triggered at "+location;
    }
}
