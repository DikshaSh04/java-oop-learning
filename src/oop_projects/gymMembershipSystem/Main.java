package oop_projects.gymMembershipSystem;

import static oop_projects.gymMembershipSystem.Member.*;

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
