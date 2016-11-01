package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class ECell extends Tool implements ItemInterface{

	public ECell()
	{
		super();
		setItemName("E-Cell");
		setItemDescription("A glowing green rode of an E-Cell.");
		setItemUse("Use to power main rooms.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
