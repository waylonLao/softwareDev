package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class KeyCard extends Tool implements ItemInterface{

	private String color;
	
	
	public KeyCard()
	{
		setItemName("Key Card");
		setItemDescription("A small plastic card.");
		setItemUse("Use to unlock colored doors.");
		//setSparkleValue(5);
		//setIsKeyItem(true);
	}
	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
