package Basics;

public class factorial {
    public static void main(String args[]){  
        int i;
        double fact=1;  
        int number=25;//It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
       }  
    
}
