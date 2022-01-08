import java.util.Scanner;

public class isNumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int tie = 1; tie <= t; tie++) {
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
