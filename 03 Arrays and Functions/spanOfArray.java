import java.io.*;
import java.util.*;

public class spanOfArray{
    public static int spanOfArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int s : arr){
            if(s > max){
                max = s;
            }
            if(s < min){
                min = s;
            }
        }
        return max-min;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();

    }
    int span = spanOfArray(arr);
    System.out.println(span);
 }

}