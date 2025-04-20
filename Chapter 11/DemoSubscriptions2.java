

public class DemoSubscriptions2
{
	public static void main(String[] args)
	{
		PhysicalNewspaperSubscription2 paper1 = new PhysicalNewspaperSubscription2();
		paper1.setName("Randy");
		paper1.setAddress("123 Bubble Gum Blvd.");
		display(paper1);

		OnlineNewspaperSubscription2 paper2 = new OnlineNewspaperSubscription2();
		paper2.setName("Reggie");
		paper2.setAddress("reggie@gmail.com");
		display(paper2);
	}
	public static void display(NewspaperSubscription2 paper)
	{
		System.out.println("\nSubscription details ");
        	System.out.println("Name : " + paper.getName());
        	System.out.println("Address : " + paper.getAddress());
        	System.out.println("Rate :  $" + paper.getRate());
	}
}
