//CSC-251-James Christenbury-Chapter 11-Exercise #3
//Date: 8-30-2020
/*This program is a subclass of the Newspaper Subscription class that inherits
  the parent class' methods. This program will make use of the contains method
  to find the @ symbol in the string that is passed through the address parameter 
  when the address object from another program references the fields in the parent
  class and utilizes the subclass setAddress method.*/

import java.util.*;

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
	@Override
	public void setAddress(String address)
	{

	boolean atsign = address.contains("@");

        if (!atsign)
	{
	    System.out.println("");
            System.out.println("Invalid address. Address has to contain @");
            this.rate = 0;
	    
        } 
	else 
	{
            this.address = address;
            this.rate = 9;
        }

	
		
    }
}	