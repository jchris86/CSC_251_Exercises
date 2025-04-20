//CSC-251-James Christenbury-First Program
//Date: 8-21-2020

import java.util.*;

public class FirstProg2
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

	while(test < 1 || test > 100)

	  {
	     System.out.println("You have to enter a number from 1-100. Enter a valid number :");
	     System.out.println("");
	     test = input.nextInt();
	     System.out.println("");
	  }

	
	 while(count < test)

	    {
		

		if(score < 0 || score > 100)
		{

		System.out.println("This is an invalid score. Please enter a valid score:");
		continue;
		}

	   	else{

		System.out.println("Enter score #" + count);
		System.out.println("");
	        score = input.nextInt();

		avg += score;
		count++;

		    }

	    }
		
		avg = avg/test;
		System.out.println("The total number of test scores is: " + test);
		System.out.println("The average test score is: " + (avg));

    }

}