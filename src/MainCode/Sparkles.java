package MainCode;

public class Sparkles extends Item implements ItemInterface{
	public Sparkles()
	{
		setItemName("Sparkles");
		setItemDescription("Currency of the Stars.");
		setItemUse("Collect for a higher score.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
