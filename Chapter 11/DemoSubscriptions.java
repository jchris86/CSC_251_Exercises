//CSC-251-James Christenbury-Chapter 11-Exercise #3
//Date: 8-30-2020
/*This program will demonstrate how objects of the parent class
  use the subclass methods to reference 
  the parent class' data fields and pass the arguments of those fields
  through the subclass' parameter specifications and output the results.*/

public class DemoSubscriptions
 {

    public static void main(String[] args) 
    {

        
        PhysicalNewspaperSubscription paper1 = new PhysicalNewspaperSubscription();
        paper1.setName("Randy");
        paper1.setAddress("911 Canterbury Road");
        display(paper1); 

	PhysicalNewspaperSubscription paper2 = new PhysicalNewspaperSubscription();
	paper2.setName("Morris");
	paper2.setAddress("Hell's Kitchen");
	display(paper2);
	
	OnlineNewspaperSubscription paper3 = new OnlineNewspaperSubscription();
        paper3.setName("Jay");
        paper3.setAddress("jaygats@outlook.com");
        display(paper3); 
 
	OnlineNewspaperSubscription paper4 = new OnlineNewspaperSubscription();
	paper4.setName("Vaughn");
	paper4.setAddress("Vaughn.gmail.com");
	display(paper4);

        

    }
    
    public static void display(NewspaperSubscription subscription){

        System.out.println("\nSubscription details ");
        System.out.println("Name : " + subscription.getName());
        System.out.println("Address : " + subscription.getAddress());
        System.out.println("Rate :  $" + subscription.getRate());
        System.out.println("------------------------------------------------------");

    }


}