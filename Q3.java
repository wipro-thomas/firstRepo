package practice;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String a = args[0];
		String b = args[1];
		String reverse = "";
		
		for(int i = b.length()-1; i>=0;i--){
			reverse = reverse+ args[1].charAt(i);
			
		}
		
		System.out.println(a+ " "+ reverse);
		
	
	}
}
