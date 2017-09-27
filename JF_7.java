//Write a program to accept 2 numbers from the user. 
//Your program must then print out all the prime numbers present between those 2 numbers
import java.util.Scanner;
public class JF_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the Second number");
		num2 = sc.nextInt();
		System.out.println("Prime number: ");
		for (int i=num1; i <= num2; i++ ){
		int j;
		for (j=2; j<i; j++){
		int n = i%j;
		if (n==0){
		break;
		}
		}
		if(i == j){
		System.out.print(" "+i);
		}
		}
		System.out.println();
		}


	}


