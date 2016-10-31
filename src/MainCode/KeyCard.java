package MainCode;

public class KeyCard extends Item implements ItemInterface{

	public KeyCard()
	{
		setItemName("Key Card");
		setItemDescription("A small plastic card.");
		setItemUse("Use to unlock colored doors.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
