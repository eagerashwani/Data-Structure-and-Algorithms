import java.io.*;
import java.util.*;

public class findElement{
    public static int findElement(int[] arr, int d) {
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(d==arr[i]){
                idx = i;
                break;
            }
        }
        return idx;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    int ans = findElement(arr,d);
    System.out.println(ans);
 }

}