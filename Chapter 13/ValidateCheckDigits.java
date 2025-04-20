//CSC-251-James Christenbury-Chapter 13-Exercise #6
//Date: 9-5-20
/*This program uses uses the BufferedWriter class to write text
  to an output stream. A file titled AccountNumbers will be scanned
  into the main method, the 31 account numbers parsed, summed, and then
  divided to see if the remainder equals the last digit of each number.*/


import java.io.*;
import java.util.*;

public class ValidateCheckDigits
{
	public static void main(String[] args)
	{

		String accountFile = "AccountNumbers.txt";
		String validFile = "Valid_Accounts.txt";

	     try(Scanner scanFile = new Scanner(new File(accountFile));
			
		BufferedWriter buffFile = new BufferedWriter(new FileWriter(validFile)))
		{

			while(scanFile.hasNextLine())
			{

				String line = scanFile.nextLine();

				int sum = 0;
			
				for(int i = 0; i < 5; i++)
				{
					sum += Integer.parseInt(line.charAt(i) + "");
				}

				int endDigit = Integer.parseInt(line.charAt(5) + "");

				if(sum%10 == endDigit)
				{
					buffFile.write(line);
					buffFile.newLine();
					System.out.println("Verified account numbers: " + line);
				}

			}
		
		}catch(IOException e)

		{
			System.out.println("Error: Cannot read or write to file. Check directory to see if file exists in the same directory.");
					
		}

	}

}