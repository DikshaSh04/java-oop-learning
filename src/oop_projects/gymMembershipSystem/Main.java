package oop_projects.gymMembershipSystem;

import static oop_projects.gymMembershipSystem.Member.totalMembers;

public class Main {
    public static void main(String[] args) {
        //create two objects
        Member m1=new Member("Diksha","1-year",false,"9821XXXXXX");
        Member m2=new Member("Ria","6-months",true,"9714XXXXXX");

        //display member info
        m1.display();
        m2.display();

        //display total members
        System.out.println("Total members:"+totalMembers);



    }

}

class Member {
    String name;  //member name
    String duration; //duration of membership
    boolean PT; //personal trainer hired or not
    String phone; //contact of member
    static int totalMembers;  //total members in gym

    //constructor
    Member(String name, String duration, boolean PT, String phone) {
        this.name = name;
        this.duration = duration;
        this.PT = PT;
        this.phone = phone;

        totalMembers++;

    }

    //method
    public void display() {
        System.out.println(this.name + " " + this.duration + " " + this.PT + " " + this.phone);
    }


}