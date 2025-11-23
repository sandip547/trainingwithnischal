package com.exosolve;

public class IfElseLadderExample {
    public static void main(String[] args) {
        int marks = 33;
        if(marks>=0 && marks<40){
            System.out.println("Grade: F");
        } else if (marks>=40 && marks<50) {
            System.out.println("Grade: E");
        } else if (marks>=50 && marks<60) {
            System.out.println("Grade: C");
        } else if (marks>=60 && marks<=100) {
            System.out.println("Grade: B");
        }else {
            System.out.println("Invalid Marks");
        }

    }
}
