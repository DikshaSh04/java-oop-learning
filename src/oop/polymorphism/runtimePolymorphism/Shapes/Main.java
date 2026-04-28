package oop.polymorphism.runtimePolymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes s1=new Shapes(); //both ref variable and object are of type 'Shapes'

        Shapes s2=new Circle();//ref variable is of type 'Shapes' and object is of type 'Circle'

        Circle s3=new Circle();//both ref variable and object is of type 'Circle'

        s1.location();
        s2.location();
        s3.location();
    }
}
