package MainCode;


/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class ItemFactory implements ItemInterface {

	static RandomGenerator rG = new RandomGenerator();
	static int randomNumber = rG.generate(100);
	static int randomNumber2 = rG.generate(3);
	
	public Item manufactureItem()
	{
		
	if(randomNumber <= 25)
	{
		return new HealthKit();
	}
	else if(randomNumber <= 45)
	{
		return new ConcussionGrenade();
	}
	else if(randomNumber <= 50)
	{
		return new ECell();
	}
	else if(randomNumber <= 65)
	{
		return new CarbonNanotubeRope();
	}
	else if(randomNumber <= 70)
	{
		return new PlasmaInducer();
	}
	else if(randomNumber <=80)
	{
		return new DisintegratingPistol();
	}
	else if(randomNumber <= 85)
	{
		return new LeadPipe();
	}
	else if(randomNumber <= 90)
	{
		if(randomNumber2 == 1)
		{
			return new RedCard();
		}
		else if(randomNumber2 == 2)
		{
			return new BlueCard();
		}
		else if(randomNumber2 == 3)
		{
			return new YellowCard();
		}
		else return new Sparkles();
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

