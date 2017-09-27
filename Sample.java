import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			Sample s = new Sample();
			System.out.println(s.div(a, b));
		} catch (InputMismatchException ie) {
			System.out.println("Enter Interger");
		}

	}

	int div(int a, int b) {
		int sum = 0;
		try {
			sum = a / b;

		} catch (ArithmeticException ae) {
			System.out.println("Input Value");
		}
		return sum;
	}
}
