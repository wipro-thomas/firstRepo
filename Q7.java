package practice;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		int num=0;
		
		//Empty string
		String primeNumber="";
		System.out.println("Enter the a value of t:");
		
		int t = scanner.nextInt();
		scanner.close();
		for(i =1; i <= t; i++)
		{
			int counter=0;
			for (num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter +1;
				}
			}
			if (counter ==2)
			{
				primeNumbers = primeNumbers + i + " ";
			
			
			}
		}
		System.out.println("Prime numbers from 1 to t are :");
		System.out.println(primeNumbers);

	}

}
