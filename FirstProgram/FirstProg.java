//CSC-251-James Christenbury-First Program
//Date: 8-21-2020
/*This program will demonstrate the use of if-else statements contained within a while loop to 
  evaluate the average of a certain number of test scores inputed by the user. The number of test scores
  to be evaluated will be inputed by the user and circulated through a while loop to confirm validity. If valid, 
  the number will be set in a second while loop where the user will be asked to input test scores within a conditional boundary until the 
  inputs hit the number of test scores set as the loop break point*/

import java.util.*;

public class FirstProg
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
	   
	   System.out.println("Enter score #" + (count+1) +":");
	   System.out.println("");
	   score = input.nextInt();
	   System.out.println("");

	   if(score >= 0 && score <= 100)
	    {
		count++;
		avg += score;
	    }
	   else 		
		{
		System.out.println("");
		System.out.println("This is an invalid score. Please enter a valid score.");
		System.out.println("");
		continue;
		}

	   }	
		avg = avg/test;
		System.out.println("The total number of test scores is: " + test);
		System.out.println("The average test score is: " + (avg));
    }
}