import java.io.*;
import java.util.*;

public class Main {

	public static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length()-1;
		while(i<=j){
			char cleft = str.charAt(i);
			char cright = str.charAt(j);
			if(cleft!=cright){
				return false;
			}
			i++;
			j--;
		}
		return true;
	
	}

	public static void solution(String str){
		//write your code here
        int n = str.length();
		for(int i = 0; i<n;i++){
			for(int j = i; j<n; j++){
				String subS = str.substring(i,j+1);
				if(isPalindrome(subS) == true){
					System.out.println(subS);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}