package MainCode;


public class ItemFactory implements ItemInterface {

	static RandomGenerator rG = new RandomGenerator();
	static int randomNumber = rG.generate(4);
	
	public Item manufactureItem()
	{
		
	if(randomNumber <= 2)
	{
		return new HealthKit();
	}
	else if(randomNumber >= 3)
	{
		return new ConcussionGrenade();
	}
	
	return null;
	}
	public static void main(String[] args)
	{
		Item randomItem = new Item();
		ItemFactory iF = new ItemFactory();
		randomItem = iF.manufactureItem();
		System.out.println(randomItem.toString());
	}
}

