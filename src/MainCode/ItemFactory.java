package MainCode;


public class ItemFactory implements ItemInterface {

	static RandomGenerator rG = new RandomGenerator();
	static int randomNumber = rG.generate(100);
	
	public Item manufactureItem()
	{
		
	if(randomNumber <= 35)
	{
		return new HealthKit();
	}
	else if(randomNumber <= 55)
	{
		return new ConcussionGrenade();
	}
	else if(randomNumber <= 70)
	{
		return new ECell();
	}
	else if(randomNumber <= 75)
	{
		return new CarbonNanotubeRope();
	}
	else if(randomNumber <= 80)
	{
		return new PlasmaInducer();
	}
	else if(randomNumber <=85)
	{
		return new DisintegratingPistol();
	}
	else if(randomNumber <= 90)
	{
		return new LeadPipe();
	}
	else if(randomNumber <= 95)
	{
		return new KeyCard();
	}
	else 
	{
		return new Sparkles();
	}
	}
	public static void main(String[] args)
	{
		Item randomItem = new Item();
		ItemFactory iF = new ItemFactory();
		randomItem = iF.manufactureItem();
		System.out.println(randomItem.toString());
	}
}

