package com.exosolve;

public class PatternExample {
    public static void main(String[] args) {
//        for(int i =1;i<=4;i++){ // 1st iteration - i = 2
//            for(int j=1;j<=i;j++){ // j = 2 and i = 1  0<=0
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }
        // 0 1 1 2 3 5 8 13
        int start=0;
        int startNecxt = 1;
        System.out.print(start + " " + startNecxt + " ");
        int sum = 0;
        for (int i =1;i<=10;i++){
            sum = start +startNecxt;  // sum = 0 + 1 sum = 1+ 1 =2  sum = 1 + 2 = 3
            System.out.print(sum + " "); // 1 2
            start = startNecxt;  //start = 1 1
            startNecxt = sum; // startNext = 1 2

        }
    }
}
