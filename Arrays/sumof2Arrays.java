package Arrays;

import java.util.Scanner;

public class sumof2Arrays {
    /**
     * ? Sum Of Two Arrays
     * ? Easy
     * 
     *
     * ? Question Statements
     * 1. You are given a number n1, representing the size of array a1.
     * 2. You are given n1 numbers, representing elements of array a1.
     * 3. You are given a number n2, representing the size of array a2.
     * 4. You are given n2 numbers, representing elements of array a2.
     * 5. The two arrays represent digits of two numbers.
     * 6. You are required to add the numbers represented by two arrays and print
     * the
     * arrays.
     * 
     * ? Constraints
     * 
     * 1 <= n1, n2 <= 100
     * 0 <= a1[i], a2[i] < 10
     * 
     ** Format
     * 
     * ? Input
     * 
     * A number n1
     * n1 number of elements line separated
     * A number n2
     * n2 number of elements line separated
     * 
     * ? Output
     * 
     * A number representing sum of two numbers, represented by two arrays.
     * 
     ** Example
     * 
     * ! Sample Input
     * 
     * 5
     * 3
     * 1
     * 0
     * 7
     * 5
     * 6
     * 1
     * 1
     * 1
     * 1
     * 1
     * 1
     * 
     * ! Sample Output
     * 
     * 1
     * 4
     * 2
     * 1
     * 8
     * 6
     * 
     * @param args
     */

    /**
     * Todo : Approach
     * Aa jao a.size-1 , b.size -1
     * carry = 0
     * sum = a.size-1+carry+ b.size-1
     * carry = sum/10 aur val = sum%10
     * c(new array) is k last index se daalna suru kre
     * c[k] = val
     * i--,j--,k-- (i,j,k index of a,b,c)
     * 
     */

    public static void sumof2Array(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int size = n1 > n2 ? n1 : n2;
        int[] c = new int[size];

        int carry = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = size - 1;

        while (k >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a[i];
            }
            if (j >= 0) {
                sum += b[j];
            }

            carry = sum / 10;
            int ans = sum % 10;
            c[k] = ans;

            i--;
            j--;
            k--;
        }
        if (carry > 0)
            System.out.println(carry);

        for (int l = 0; l < size; l++) {
            System.out.println(c[l]);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        sumof2Array(a1, a2);

    }

}
