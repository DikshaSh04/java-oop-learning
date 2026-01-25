package oop.basics;

public class ClassAndObject { //here we create a class and its object and insert/display its values.

    public static void main(String[] args) {

        //object diksha of type 'Employee' is created
        Employee Diksha = new Employee();

        //adding values of fields
        Diksha.Id = 45;
        Diksha.name = "Diksha Sharma";
        Diksha.dept = "Tech";

        //displaying values
        System.out.println(Diksha.Id);
        System.out.println(Diksha.name);
        System.out.println(Diksha.dept);

    }
}
//creating class 'Employee' with three fields
class Employee {
    int Id;
    String name;
    String dept;
}