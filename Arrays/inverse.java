package Arrays;

import java.io.*;
import java.util.*;

public class inverse {

    /**
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