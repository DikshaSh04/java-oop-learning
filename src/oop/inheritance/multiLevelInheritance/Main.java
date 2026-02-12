package oop.inheritance.multiLevelInheritance;

import oop.inheritance.multiLevelInheritance.*;

public class Main {
    public static void main(String[] args) {
        Animal cat=new Animal(6,"Land",true);

        System.out.println(cat.display());

        Fish nemo=new Fish(3,"Ocean",false);
        System.out.println(nemo.display());

    }
}
