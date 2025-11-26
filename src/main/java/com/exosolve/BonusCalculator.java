package com.exosolve;

public class BonusCalculator {
    //Question
//    Input years of service:
//    < 1 year → No bonus
//    1 to 3 → 5%
//    3 to 6 → 10%
//    Above 6 → 15% bonus
//    Calculate final salary.

    public static void main(String[] args) {

        int salary = 5000;
        int number_of_years = 6;
        double bonus = 0;
        if
        (number_of_years < 1) {
            bonus = 0;
        } else if
        (number_of_years <= 3) {
            bonus = 0.5;
        } else if
        (number_of_years <= 6) {
            bonus = 0.10;
        }  else {
                                                bonus = 0.15; }
        double bonusAmount = salary * bonus;
        double finalSalary = salary + bonusAmount;

        System.out.println("Final salary:" + finalSalary);

    }
}
