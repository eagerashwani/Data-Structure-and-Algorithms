package Recursion;

import java.util.Scanner;

public class printDecreasing {

    public static void printDecreasing(int n){
        if(n==0){
            //baseCase
            return;
            // return rok rha hai function ko jab n 0 pe aa gya
        }
        System.out.println(n);
        printDecreasing(n-1);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

}
