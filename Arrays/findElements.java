package Arrays;

import java.util.Scanner;

public class findElements {

    /**
     * ? Find Element In An Array
     * ? Easy
     *
     * ? Question Statements
     * 1.You are given a number n, representing the size of array a.
     * 2.You are given n distinct numbers, representing elements of array a.
     * 3. You are given another number d.
     * 4. You are required to check if d number exists in the array a and at what
     * index (0 based). If found print the index, otherwise print -1.
     * 
     * ? Constraints
     * 
     * 1 <= n <= 10^7
     * -10^9 <= n1, n2
     * .. n elements <= 10^9
     * -10^9 <= d <= 10^9
     * 
     ** Format
     * 
     * ? Input
     * 
     * A number n
     * n1
     * n2
     * .. n number of elements
     * A number d
     * 
     * ? Output
     * 
     * A number representing index at which d is found in array a and -1 if not
     * found
     * 
     ** Example
     * 
     * ! Sample Input
     * 
     * 6
     * 15
     * 30
     * 40
     * 4
     * 11
     * 9
     * 40
     * 
     * ! Sample Output
     * 
     * 2
     * 
     */

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