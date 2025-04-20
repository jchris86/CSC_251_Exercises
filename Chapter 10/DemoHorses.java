//CSC-251-James Christenbury-Chapter 10-Exercise #1
//Date: 8-24-2020
/*This program is a demonstration of how the RaceHorse class inherits
  the methods of the Horse class using objects from each class*/

public class DemoHorses
{
	public static void main(String args[])
	{
		Horse aHorse = new Horse();
		RaceHorse aRaceHorse = new RaceHorse();
		aHorse.setName("SeaBiscuit");
		aHorse.setColor("brown");
		aHorse.setBirthYear(1938);
		aRaceHorse.setRaces(10);
		System.out.println(aHorse.getName() + " was born in " + aHorse.getBirthYear() +
		". The " + aHorse.getColor() + " horse has won " + aRaceHorse.getRaces() + " races.");  
	}
}	