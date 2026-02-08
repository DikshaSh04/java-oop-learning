package oop.basics.thisKeyword;

import oop.basics.thisKeyword.Student;

public class Main {
    public static void main(String[] args) {

        //creating objects 'Diksha' and 'Ria' of type 'Student'
        Student Diksha=new Student(69,"Diksha Sharma",88.5f);
        Student Ria=new Student(12,"Ria Sharma",89.6f);

        //displaying values of objects
        Diksha.printFields();
        Ria.printFields();

        //creating object 'std1' without passing parameters
        Student std1=new Student();

        //displaying values of object 'st1'
        std1.printFields();
        //it will call the constructor that is calling another constructor


    }
}
