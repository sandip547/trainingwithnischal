package com.exosolve;

import java.util.Scanner;
import java.util.SortedMap;

public class Authentication {
    public static void main(String[] args) {
        String dbUserName = "Nischal@23";
        System.out.println(System.identityHashCode(dbUserName));
        String dbPassword = "Nischal@";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username :");
        System.out.println("----------------");
        String userName = in.next();
        System.out.println(System.identityHashCode(dbUserName));
        System.out.println("Enter Password :");
        System.out.println("----------------");
        String password = in.next();
        if (userName.equals(dbUserName) && password.equals(dbPassword)){
            System.out.println("Authenticated");
            System.out.println("Welecome to Home Page");
        }else {
            System.out.println("Username and password is incorrect");

        }

    }
}
