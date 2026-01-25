package oop.basics;

public class ThisKeyword { //use of 'this' keyword and assign diff set of values to diff objects

    public static void main(String[] args) {

        //creating objects 'Diksha' and 'Ria' of type 'Student'
        Student Diksha=new Student(69,"Diksha Sharma",88.5f);
        Student Ria=new Student(12,"Ria Sharma",89.6f);

        //displaying values of objects
        System.out.println(Diksha.roll+" "+Diksha.name+" "+Diksha.marks);
        System.out.println(Ria.roll+" "+Ria.name+" "+Ria.marks);


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
}
