//Write a program to accept 2 strings from the user (via command line). 
import java.util.Scanner;
public class JF_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter String 1");
        String name=scanner.nextLine();


        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string 2");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
           reverse = reverse + original.charAt(i);
        
        System.out.println("The concatenated string is:"+name+reverse);
	}
}
