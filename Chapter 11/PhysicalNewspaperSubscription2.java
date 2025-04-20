
public class PhysicalNewspaperSubscription2 extends NewspaperSubscription2
{

	@Override
	public void setAddress(String address)
	{
		int count = 0;
		for(int i = 0; i < address.length(); i++)
		{
			if(Character.isDigit(address.charAt(i)))
			{
				count++;
			}

			if(count >= 1)
			{
				this.address = address;
				this.rate = 15;
			}

			else
			{
				this.rate = 0;
				System.out.println("Address must contain at least one digit");
			}
		}
	}
}