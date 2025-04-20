//CSC-251-James Christenbury-Chapter 11-Exercise #3
//Date: 8-30-2020
/*This program is a subclass of Newspaper Subscription that will utilize
  the override feature in order to set conditions on the parameter to 
  be passed through the setAddress method. This program will also show
  how streams and references can be used for an object to call other methods.*/


public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
	@Override
	public void setAddress(String address)
	 {
		
	
        boolean digit = address.chars().anyMatch(Character::isDigit);

        if(!digit)
	{
	    System.out.println("");
            System.out.println("Invalid address. Address has to contain at least one digit");
            this.rate = 0;
        }
        else
	 {
            this.address = address;
            this.rate = 15;
        }

    }
}