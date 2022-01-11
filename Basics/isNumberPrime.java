package Basics;
import java.util.Scanner;

//? Question Statement
//* 1. You've to check whether a given number is prime or not.
//* 2. Take a number "t" as input representing count of input numbers to be tested.
//* 3. Take a number "n" as input "t" number of times.
//* 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

//? Constraints
//* 1 <= t <= 10000
//* 2 <= n < 10^9

//?Example

//! Sample Input

//* 5
//* 13
//* 2
//* 3
//* 4
//* 5

//! Sample Output

//* prime
//* prime
//* prime
//* not prime
//* prime

public class isNumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int times = 1; times <= t; times++) {
            int n = scn.nextInt();

            int factor = 0;

            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    factor++;
                    break;
                }
            }
            if (factor == 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println(" Prime");
            }
        }

    }
}
