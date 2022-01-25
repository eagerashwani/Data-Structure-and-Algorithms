package GFG.Array.School;

import java.util.Scanner;

public class trailingZeros {
    static int trailingZeroes(int N){
        // Write your code here
   int count=0;
        for(int i=5;i<=N;i=i*5)
            count=count+N/i;
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(trailingZeroes(n));
        
    }
}
