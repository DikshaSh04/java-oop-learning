package oop.inheritance.multiLevelInheritance;

public class Fish extends Animal{


    Fish(int age,String habitat,boolean isMammal){
        super(age,habitat,false);
        super.display();
    }

}
