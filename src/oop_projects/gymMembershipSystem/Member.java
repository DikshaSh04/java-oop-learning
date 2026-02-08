package oop_projects.gymMembershipSystem;

public class Member {
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
