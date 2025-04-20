//CSC-251-James Christenbury-Chapter 12-Exercise #5
//Date:9-6-2020
/*This program utilizes try and catch blocks with a throw statement that will
  throw Arithmetic Exceptions, negative numbers in this case, out of the Math.sqrt() method used for calculating
  square roots of numbers. The exception will be displayed and a message will say that
  negative numbers cannot be square rooted.*/



import java.util.*;


public class SqrtException
{

	public static void main(String [] args) 
	{
		char character = 'a';
		double x = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value:");

	while(x != character)
	{
	  try{ 
		x = input.nextDouble();
		System.out.println("");
		Math.sqrt(x);

		if(x >= 0)
		{
		System.out.println("The square root is " + Math.sqrt(x));
		System.out.println("");
		System.out.println("Enter another value:");
		System.out.println("");
		}

		else
		{
			throw new ArithmeticException();
		}

	      }
		catch(ArithmeticException e)
	 	   {
			System.out.println(e);
			System.out.println("Negative square roots cannot be computed. Try again:");
			System.out.println("");
		   }

	}

	
		
	}


}
		

