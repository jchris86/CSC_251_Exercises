

public class IncomingPhoneCall extends PhoneCall
{

	public IncomingPhoneCall(String phonum)
	{
		super(phonum);
		setPrice();
	}


	@Override
	public void display(PhoneCall phonum)
	{
		System.out.println("Phone Number: " + phonum.getNumber());
		System.out.println("Call rate: $" + phonum.getPrice());
	}

}
	
		
