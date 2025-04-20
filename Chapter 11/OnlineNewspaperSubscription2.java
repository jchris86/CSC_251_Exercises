
public class OnlineNewspaperSubscription2 extends NewspaperSubscription2
{
	@Override
	public void setAddress(String address)
	{
		
		
		for(int i = 0; i < address.length(); i++)
		{
			if(address.contains("@"))
			{
				this.address = address;
				this.rate = 9;
			}

			else
			{
				this.rate = 0;
				System.out.println("Address must contain an @ sign");
			}
		}
	}
}