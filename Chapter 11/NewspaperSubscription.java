//CSC-251-James Christenbury-Chapter 11-Exercise #3
//Date: 8-30-2020
/*This program is an abstract class for a newspaper subscription
  that will pass on its methods to two subclasses as a demonstration
  of inheritance. The declared fields will be referenced using objects
  from the subclasses when they are used for arguments in method calls*/



public abstract class NewspaperSubscription
{
   String name;
   String address;
   double rate;
   
   public void setName(String name)
   {
	this.name = name;
   }
  
   public String getName()
   {
	return name;
   }

   public double getRate()
   {
	return rate;
   }
  
   public String getAddress()
   {
	return address;
   }

   public abstract void setAddress(String address);

}

   