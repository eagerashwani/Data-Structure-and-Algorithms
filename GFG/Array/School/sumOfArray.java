package GFG.Array.School;

import java.util.Scanner;

public class sumOfArray {
    public static Scanner scn = new Scanner(System.in);

    public static int sumOfArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        return sum;
    }

 

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = sumOfArray(arr, n);
        System.out.println("The Sum Of Array is "+ sum);

    }

}
