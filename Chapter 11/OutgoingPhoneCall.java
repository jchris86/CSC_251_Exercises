

public class OutgoingPhoneCall extends PhoneCall
{
	double time;

	public OutgoingPhoneCall(String phonum, double time)
	{
		setPrice();
	}

	public void setPrice(double price)
	{
		price = 0.04;
	}

	@Override
	public void display(String phonum)
	{
		System.out.println("Phone Number: " + phonum.getNumber());
		System.out.println("Call rate: $" + phonum.getPrice() + " per minute");
		System.out.println("The number of minutes is: " + time);
		System.out.println("The phone call cost is: " + phonum.getPrice() * time);
		
	}

}