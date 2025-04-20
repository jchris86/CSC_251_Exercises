

public class DemoPhoneCalls
{
	public static void main(String[] args)
	{
		Phonecall call1 = new IncomingPhoneCall("704-672-3465");
		
		Phonecall call2 = new OutgoingPhoneCall("704-980-1323", 30);

		display(call1);
		display(call2);
	}

}

		