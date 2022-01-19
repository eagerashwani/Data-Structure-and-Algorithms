package Arrays;

import java.util.Scanner;

public class findElements {

    /**
     * 
     * Todo : Approach
     * array aur data le liya
     * array k index pe hai kya wo data k equal hai? (compare kiya array ke har
     * element ko data se)
     * return kar diya kis index pe data mila
     */

    public static int searchinArray(int[] arr, int d) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int ans = searchinArray(arr, d);
        System.out.println("D found at " + ans);

    }

}