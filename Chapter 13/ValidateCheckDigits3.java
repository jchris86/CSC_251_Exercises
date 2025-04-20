
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class ValidateCheckDigits3
{
     public static void main(String[] args);
     {
	Path file = 
		Paths.get("This PC\\Desktop\\CSC-251-Advanced Java\\Chapter 13\\AccountNumbers.txt");
	
	InputStream input = null;
	
	try{
		Scanner scanFile = new Scanner(new File(file));
		
		input = Files.newInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

		while(input.hasNextLine())
		{
		    int sum = 0;
		

			for(int i=0; i < 5; i++)
			{
				
				sum += Integer.parseInt(input.charAt(i) + "");
			}

			int endDigit = Integer.parseInt(input.charAt(5) + "");

			if(sum%10 == endDigit)
			{
				output.write(line);
				output.newLine();
				System.out.println("Verified account numbers: " + output);
			}
		}
	    }catch(IOException e)

		{
			System.out.println("Error: Cannot read or write to file. Check directory to verify if file exists in the same directory.");

		}
      }

}