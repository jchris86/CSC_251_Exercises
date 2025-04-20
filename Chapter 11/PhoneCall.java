import java.util.*;

public abstract class PhoneCall
{
	String phonum;
	double price;

	public PhoneCall(String phonum)
	{
		this.phonum = phonum;
		price.setPrice = 0.0;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public abstract String getNumber();

	public abstract double getPrice();

	public abstract void display();
	
}


