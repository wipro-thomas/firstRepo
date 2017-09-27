//Write a program to accept gender ("Male" or ""Female"") and age (range 1 to 120) as command line arguments from the user. 
//Your program must then print the percentage of interest for the details entered based on below information.
import java.util.Scanner;

public class JF_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Gender");
        int gender=scanner.nextInt();
        
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        
		if (gender == male && age == (1 > 60)) {
        	System.out.println("The interest rate is 9.2%")
        }else if (gender == male && age == (61 > 120)) {
                System.out.println("The interest rate is 8.3%")
        }else if (gender == female && age == (1 > 58)) {
                System.out.println("The interest rate is 8.2%")
        }else if (gender == male && age == (59 > 120)) {
                System.out.println("The interest rate is 7.6%")
	}

}
}