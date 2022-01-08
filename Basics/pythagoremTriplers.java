package Basics;
import java.util.Scanner;

public class pythagoremTriplers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a*a==(b*b+c*c)||b*b==(a*a+c*c)||c*c==(a*a+b*b)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    
}
