package org.example;

public class SavingAcount {

    private static double AnnualInterestRate;

    private double SavingBalance;
    private void get(){
        this.SavingBalance=SavingBalance;
    }
    private double CalculateMounthlyInterest(){
    return (AnnualInterestRate* SavingBalance) /12;
    }

}
