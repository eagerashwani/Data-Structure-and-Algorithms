package Recursion.arrayRecursion;

import java.util.Scanner;

public class displayArrReverse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        displayArrReverseFn(arr,0);
        
    }

    private static void displayArrReverseFn(int[] arr, int idx) {
        if(idx == arr.length){
            return;

        }
        displayArrReverseFn(arr, idx+1);
        System.out.println(arr[idx]);
    }
    
}
