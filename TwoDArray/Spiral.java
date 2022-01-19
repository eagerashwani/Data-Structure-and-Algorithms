package TwoDArray;

import java.util.Scanner;

public class Spiral {

    public static Scanner scn = new Scanner(System.in);

    public static void input(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void spiral(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;

        
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        input(arr);
        spiral(arr);

        
    }
    
}
