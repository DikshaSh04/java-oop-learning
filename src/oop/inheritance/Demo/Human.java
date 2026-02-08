package oop.inheritance.Demo;

public class Human extends Species{
    String occupation;

    Human(int age, String naturalHabitat,String occupation) {
        super(age, naturalHabitat); //'super' used to call the parent constructor 'Species()'
        this.occupation=occupation;
    }

    public String display(){
        return "Age:"+this.age+"\n"+"Habitat:"+this.naturalHabitat+"\n"+"Occupation:"+this.occupation;
    }
}
