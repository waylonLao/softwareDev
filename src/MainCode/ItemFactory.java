package MainCode;

import java.util.Random;

public class ItemFactory implements ItemInterface {

	public Item getItemName(){
	Random number = new Random(4);
	
	if(number <= 2)
	{
		return new HealthKit(1);
	}
	else if(number >= 3)
	{
		return new ConcussionGrenade(2);
	}
	
	return null;
	}
}
