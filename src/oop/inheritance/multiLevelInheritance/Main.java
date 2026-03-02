package oop.inheritance.multiLevelInheritance;

import oop.inheritance.multiLevelInheritance.*;

 //this is an example of multilevel inheritance
 //sub-class 'Fish' is inherited from super class 'Animal'
//'Animal' itself is a sub-class of the super class 'Species'

public class Main {
    public static void main(String[] args) {
        Animal cat=new Animal(6,"Land",true);

        System.out.println(cat.display());

        Fish nemo=new Fish(3,"Ocean",false);
        System.out.println(nemo.display());

    }
}
