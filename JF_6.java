//Write a program to accept 2 numbers from the user.
//Your program must then print out all even numbers present between those 2 numbers 
import java.util.Scanner;
public class JF_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer value-> ");
		int k = input.nextInt();
		input = new Scanner(System.in);
		System.out.print("Enter a larger value-> ");
		int j = input.nextInt();
		int i = k;
		if(i % 2 == 1)
		    i++;

		while (i <= j) {
		    System.out.println(i); 
		    i = i + 2;
		}

	}

}
