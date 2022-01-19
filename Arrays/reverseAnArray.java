package Arrays;

import java.io.*;
import java.util.*;

public class reverseAnArray {

    /**
     * Todo : Approach
     * phle i, j ko array ke first aur last index pr rkh do
     * phir temp mey a[i] ko store kr lo
     * a[i] pe a[j] daal do
     * a[j] pe temp daal do
     * i++ j-- dono ko pass late rho 
     * tab tak i<=j se
     */

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void reverse(int[] a) {
        // write your code here
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}
