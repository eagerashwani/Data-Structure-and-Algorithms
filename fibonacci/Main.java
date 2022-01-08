package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0;
        int b = 1;

        int n = scn.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }


    }
    
}
