package com.company;

public class Member extends Person {


    private String name;
    private String CPR;
    private String membership;
    private int fee;

    public Member(){

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCPR() {
        return CPR;
    }

    @Override
    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    @Override
    public String getMembership() {
        return membership;
    }

    @Override
    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public Member (String name, String CPR, String membership){

        this.setName(name);
        this.setCPR(CPR);
        this.setMembership(membership);
        if (membership.equalsIgnoreCase("basic")){
            this.fee = 199;
            setMembership("Basic");
        } else {
            this.fee = 299;
            setMembership("Full");
        }

}
    @Override
    public String toString(){
        return name + "\t\t" + CPR + "\t\t" + membership + "\t\t" + fee;
    }
}
