package Basics;

import java.util.Scanner;

public class primeNumberTillN {

    /**
     * 
     * ? Name : Print All Primes Till N
     * ? Difficulty : Easy
     * 
     * ? Question Statements
     * 1. You've to print all prime numbers between a range.
     * 2. Take as input "low", the lower limit of range.
     * 3. Take as input "high", the higher limit of range.
     * 4. For the range print all the primes numbers between low and high (both
     * included).
     * 
     * ? Constraints
     * 
     * 2 <= low < high < 10 ^ 6
     * 
     ** Format
     * 
     * ? Input
     * 
     * low
     * high
     * 
     * ? Output
     * 
     * n1
     * n2
     * .. all primes between low and high (both included)
     * 
     ** Example
     * 
     * ! Sample Input
     * 
     * 6
     * 24
     * 
     * ! Sample Output
     * 
     * 7
     * 11
     * 13
     * 17
     * 19
     * 23
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) {

            int factor = 0;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    factor++;
                    break;
                }

            }
            if (factor == 0) {
                System.out.println(n);
            }

        }

    }

}
