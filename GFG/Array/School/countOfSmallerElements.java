package GFG.Array.School;

import java.util.Scanner;

public class countOfSmallerElements {
    public static Scanner scn = new Scanner(System.in);

    public static int countOfElements(int arr[], int n, int x)
    {
        int count = 0;
        for(int i =0; i<n ; i++){
            if(arr[i]<=x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
          int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
       int elements = countOfElements(arr,n,x);
       System.out.println(elements);
    }
}
