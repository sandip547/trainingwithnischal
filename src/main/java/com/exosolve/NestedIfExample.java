package com.exosolve;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        int points = 0;
        int min_programming_score = 3;
        int input_iq = 75;
        System.out.println("Here is your programming test");
        System.out.println("-----------------------------");
        System.out.println("What is size of int :");
        Scanner scanner = new Scanner(System.in);
        int size_of_int = scanner.nextInt();
        if (size_of_int==4){
            points = points + 2;
        }
        System.out.println("What is size of byte :");
        int size_of_byte = scanner.nextInt();
        if (size_of_byte==2){
            points = points + 2;
        }

        if(points>=min_programming_score){
            System.out.println("your score is :" + points);
            System.out.println("you have passed the programming test");
            if (input_iq>60) System.out.println("you have passed the iq test");
            else System.out.println("your iq points are below the benchmark");
        }else{
            System.out.println("your points are below the benchmark");
        }

    }
}
