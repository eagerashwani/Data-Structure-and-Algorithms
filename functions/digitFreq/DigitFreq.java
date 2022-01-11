package functions.digitFreq;

import java.util.Scanner;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;  // last digit nikal rhe
            n = n / 10;  // number ko reduce kr rhe
            if (rem ==d) {
                
                temp++;
            }
        }
        return temp;
    }
}