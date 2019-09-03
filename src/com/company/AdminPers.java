package com.company;

public class AdminPers extends Person {

    private int vacation;

    public AdminPers(String name, String CPR){
        this.setName(name);
        this.setCPR(CPR);
        this.setHours(37);
        this.vacation = 5;
        this.setSalary(33000);
    }




    public String toString() {
        return super.toString() + "\t" + this.vacation;
    }


}
