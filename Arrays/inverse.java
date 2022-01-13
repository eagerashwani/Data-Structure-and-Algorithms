package Arrays;

import java.io.*;
import java.util.*;

public class inverse {

    /**
     *? Inverse Of An Array
     *? Easy
     * 
     *? Question Statements 
     * 1. You are given a number n, representing the size of array a.
     * 2. You are given n numbers, representing elements of array a.
     * 3. You are required to calculate the inverse of array a.
     * 
     * The only difference is the range of values is from 0 to n - 1, instead of 1
     * to n.
     * 
     *? Constraints
     * 
     * 0 <= n < 10^7
     * The only difference is the range of values is from 0 to n - 1, instead
     * of 1 to n
     * 
     ** Format
     * 
     *? Input
     * 
     * Input is managed for you
     * 
     *? Output
     * 
     * Output is managed for you
     * 
     ** Example
     * 
     *! Sample Input
     * 
     * 5
     * 4
     * 0
     * 2
     * 3
     * 1
     * 
     *! Sample Output
     * 
     * 1
     * 4
     * 2
     * 3
     * 0
     * 
     * Todo : Approach
     * phle ek nyi array bna lenge same length ki
     * arr[i] usko save kr lenge val mey
     * nyiarr[val] = i daal denge
     * 
     */



    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] a) {
        // TODO: write your code here
        int [] newArr = new int[a.length];
        for(int i=0;i<a.length;i++){
            int val = a[i];
            newArr[val] = i;
        }
        return newArr;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}