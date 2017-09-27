//Write a Program to accept two integers through the command line argument 
//and print the sum of the two numbers 
public class JF_4 {

	public static void main(String[] args) {
		
		int x,y,s;
		 
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);

        s=x+y;
        System.out.println("sum of " + x + " and " + y +" is " +s);

	}

}
