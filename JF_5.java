//Write a program to accept a number from the user. 
//Your program must then verify if the entered number is positive or negative or zero 
//and print an appropriate message  
import java.util.Scanner;

public class JF_5 {

	public static void main(String[] args) {
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        
	        System.out.print("Enter the number you want to check:");
	        n = s.nextInt();
	        if(n > 0)
	        {
	            System.out.println("The given number "+n+" is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The given number "+n+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is neither Positive nor Negative ");
	        }

	}

}
}
