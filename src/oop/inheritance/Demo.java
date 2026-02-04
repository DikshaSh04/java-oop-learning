package oop.inheritance;

public class Demo { //demo of how inheritance is used in JAVA
    public static void main(String[] args) {
        Human Diksha=new Human(30,"Land","Doctor");

        System.out.println(Diksha.display());

    }

}

class Species{
    int age;
    String naturalHabitat;

    Species(int age,String naturalHabitat){
        this.age=age;
        this.naturalHabitat=naturalHabitat;

    }

}

class Human extends Species{
    String occupation;

   Human(int age, String naturalHabitat,String occupation) {
       super(age, naturalHabitat); //'super' used to call the parent constructor 'Species()'
       this.occupation=occupation;
    }

    public String display(){
        return "Age:"+this.age+" "+"Habitat:"+this.naturalHabitat+" "+"Occupation:"+this.occupation;
    }
}



