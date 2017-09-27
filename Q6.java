package practice;
import java.util.Scanner;

public class Q6 {
	 public static void main(String[] args){
		
		// create a scanner for user input
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		
		// get's user input for min range
		int min=reader.nextInt();
		
		System.out.println("Enter your second number");
		
		//get's user to input max range
		int max=reader.nextInt();
		
		for (int i=min; i < max + 1; i++)
		{
			System.out.println(i);
		}
	}
}
