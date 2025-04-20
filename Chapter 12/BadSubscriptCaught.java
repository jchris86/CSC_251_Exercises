//CSC-251-James Christenbury-Chapter 12 Exercise #1
//Date: 9-2-20
/*This program will demonstrate Exception handling by using a try block to find
  an exception in the program, and a catch block to receive the exception and
  display a message specifying why the exception occurred. The specific program
  will be an array of names, and the exception will be an array value that is out
  of bounds of the array. The array will include 8 names, and a user will be asked
  to enter an integer. Because the array has 8 strings, the numbers range from 0 to 7.
  A while loop is used so the user can enter a number until a number that is out of
  array bounds is entered, which will terminate the program.*/


import java.util.*;
public class BadSubscriptCaught
{

	public static void main(String [] args)
	{
		String [] fnames = {"Larry", "Moe", "Curly", "Groucho", "Harpo", "Chico", "Charlie", "Buster"};
		char character;
		character = 'a';
		int x = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer to display the name associated with the position:");

		do
		{

		try{
			
			
			System.out.println("");
			x = input.nextInt();
			System.out.println("");
			System.out.println(x + ": " + fnames[x]);
			System.out.println("");
			System.out.println("Enter another number to display the associated name:");

		    }catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.print(e);
			System.out.println("");
			System.out.println("Error: The number you entered is out of bounds of the array. Enter a valid number:");	
			}

		}while(x != character);

	}

}
			