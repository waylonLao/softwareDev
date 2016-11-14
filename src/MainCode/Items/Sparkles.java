package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Sparkles extends Item implements ItemInterface{
	public Sparkles()
	{
		setItemName("Sparkles");
		setItemDescription("Currency of the Stars.");
		setItemUse("Collect for a higher score.");
		//setSparkleValue(1);
	}
	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
