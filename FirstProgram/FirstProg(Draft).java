//CSC-251-James Christenbury-First Program
//Date: 8-21-2020

import java.util.*;

public class FirstProg(Draft)
{
   public static void main(String[] args)
    {
	
	int score = 0;
	int count = 0;
	double avg = 0;
	int test;

	Scanner input = new Scanner(System.in);
	System.out.println("How many test scores do you want to enter?");
	System.out.println("");
	test = input.nextInt();
	System.out.println("");

	
	

	if(test < 1 || test > 100)

	  {
	     System.out.println("You have to enter a number from 1-100. Enter a valid number :");
	     System.out.println("");
	     test = input.nextInt();
	     System.out.println("");
	     continue;
	  }

	else
	{
	   do
	   {	

	   if(score < 0 || score > 100)

	    {
		System.out.println("This is an invalid score. Please enter a valid score:");
		System.out.println("");
	        score = input.nextInt();
		System.out.println("");
	    }
	
	   else if(score >= 0 && score <= 100)
			
		{

		count++;

		System.out.println("Enter score #" + count);
		System.out.println("");
	        score = input.nextInt();
		System.out.println("");
		
		avg += score;

		}

	

	   }while (count < test);
		
		avg = avg/test;
		System.out.println("The total number of test scores is: " + test);
		System.out.println("The average test score is: " + (avg));
	}
    }

}