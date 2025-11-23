package com.exosolve;

public class ExampleIfElse {
    public static void main(String[] args) {
        int age = 55;
        int start_limit = 18;
        int end_limit = 60;
        if(age>=start_limit && age<=end_limit){
            System.out.println("You can apply for driving liscense");
            System.out.println("----------------------------------");
            System.out.println("Enter your name:");
        }else{
            System.out.println("your are not eligible to apply for driving liscense");
        }
    }

}
