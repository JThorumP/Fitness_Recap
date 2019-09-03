package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();



        personList.add(new AdminPers("Joakim", "231194-1189"));
        personList.add(new Instructor("Anton", "061097-0907", 25));

        System.out.println("################################################");
        System.out.println();
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("Name: " + "\t" + "CPR: " + "\t" + "Hours: " + "\t" + "Salary: " + "\t" + "Vacation: ");
        System.out.println("------------------------------------------------");
        System.out.println();

        for (Person person: personList){
            System.out.println(person.toString());
        }

        List<Member> memberList = new ArrayList<>();

        memberList.add(new Member("Karsten","130789-0809","Basic"));
        memberList.add(new Member("Johanne","051194-1298","Full"));

        System.out.println("\n" + "\n");
        System.out.println("################################################");
        System.out.println();
        System.out.println("FITNESS MEMBERS");
        System.out.println("Name:" + "\t\t" + "CPR:" + "\t\t" + "Membership:" + "\t\t" + "Fee:");
        System.out.println("------------------------------------------------");
        System.out.println();

        for (Member member: memberList){
            System.out.println(member);
        }

        System.out.println("\n" + "\n");
        System.out.println("################################################");
        System.out.println();
        System.out.println("EMPLOYEES & MEMBERS Name and CPR");
        System.out.println("Name:" + "\t\t" + "CPR:");
        System.out.println("------------------------------------------------");
        System.out.println();

        for (Person person: personList){

            System.out.println(person.getName() + "\t\t" + person.getCPR());
        }
        for (Member member: memberList){
            System.out.println(member.getName() + "\t\t" +member.getCPR());
        }
    }

}
