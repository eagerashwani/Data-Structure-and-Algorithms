package Arrays;

import java.util.Scanner;

public class binarySearch {

    /** (In Binary Search data is sorted in any order asc/des)
     * Todo : Approach
     * 
     * place i,j on first and last element of array
     * mid = i+j/2
     * array k mid pe data mil jaye to return kr do
     * aur agr array[mid] < data to i = mid+1
     * nhi to array[mid] > data to j = mid-1
     * tab tak krte rho i<=j
     */

    public static int binarySearchHere(int[] arr, int data) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int ans = binarySearchHere(arr, data);
        System.out.println("Data found at "+ans);

    }

}
