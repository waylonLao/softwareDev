package MainCode;

public class ECell extends Item implements ItemInterface{

	public ECell()
	{
		setItemName("E-Cell");
		setItemDescription("A glowing green rode of an E-Cell.");
		setItemUse("Use to power main rooms.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
