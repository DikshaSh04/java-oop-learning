package oop.inheritance.multiLevelInheritance;


public class Animal extends Species {
    boolean isMammal;

    Animal(int age,String habitat,boolean isMammal){
        super(age,habitat);
        this.isMammal=isMammal;

    }

    public String display(){
        return "Age: "+this.age+"\nHabitat: "+this.habitat+"\nIs a mammal? "+this.isMammal;
    }

}
