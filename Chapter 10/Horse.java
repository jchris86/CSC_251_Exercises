//CSC-251-James Christenbury-Chapter 10-Exercise #1
//Date: 8-22-2020
/*This program is a public class named Horse with data fields for 
  name, color, and birth year. Methods are also inlcuded to get and set
  these fields*/


public class Horse
{
	private String name;
	private String color;
	private int birthYear;
	
public String getName()
	{
		return name;
	}
public String getColor()
	{
		return color;
	}
public int getBirthYear()
	{
		return birthYear;
	}
public void setName(String n)
	{
		name = n;
	}
public void setColor(String c)
	{
		 color = c;
	}
public void setBirthYear(int b)
	{
		birthYear = b;
	}
}	