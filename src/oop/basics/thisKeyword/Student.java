package oop.basics.thisKeyword;

public class Student {
    int roll;
    String name;
    float marks;


    //defining constructor taking in arguments to assign different values to different objects
    Student(int rno,String stdname,float stdmarks){
        this.roll=rno;
        this.name=stdname;
        this.marks=stdmarks;
    }

    //a function that displays all three fields of an object
    void printFields(){
        System.out.println(this.roll+" "+this.name+" "+this.marks);
    }

    //'this' keyword can also be used to call a constructor from another constructor
    Student(){

        this(0,"default",0.0f);
        //internally it means: new Student(0,"default",0.0f);
    }
}
