
import java.util.*;

public abstract class NewspaperSubscription2
{

	String name;
	String address;
	double rate;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public abstract void setAddress(String address);
	
	public Double getRate()
	{
		return rate;
	}

}