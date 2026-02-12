package oop.inheritance.singleInheritance;
//This is an example of single inheritance
//sub-class 'Human' is derived from only one super class 'Species'

public class Main {
    public static void main(String[] args) {
        Human Diksha = new Human(30, "Land", "Doctor");

        System.out.println(Diksha.display());
    }
}

