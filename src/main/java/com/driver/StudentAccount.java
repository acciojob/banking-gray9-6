package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default public void setInstitutionName(String institutionName) {
        //        this.institutionName = institutionName;
        //    }
        super(name,balance,0);
        this.institutionName = institutionName;

    }


}
