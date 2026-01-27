package oop.basics;

public class ThisKeyword { //use of 'this' keyword and assign diff set of values to diff objects

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
//creating class 'Student' consisting of fields roll no,name and marks
class Student{
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
