package Basics;

import java.util.Scanner;

public class digitsOfANumber {

 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        //number of digits    eg. 1256  -- nod=4
        int nod = 0;
        int temp = n; //1256
        while(temp != 0){
          temp = temp / 10;
          nod++;
        }
        
        int x = nod -1;
        int divisor = (int)Math.pow(10,x);  //10^x
        
        while(divisor != 0){
            int d = n / divisor;
            System.out.println(d);
            n = n % divisor;
            divisor = divisor /10;
            
        }
        
       }
      }