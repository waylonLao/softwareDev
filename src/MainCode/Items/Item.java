package MainCode.Items;

import java.io.Serializable;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Item implements Serializable{
    
	private int itemID;
    private String itemName;
    private String itemDescription;
    private String itemUse;
    private int sparkleValue;
    private boolean isKeyItem;
    private boolean isWeapon;
    
    public Item()
    {
        itemID = 0;
        itemName = "null";
        itemDescription = "null";
        itemUse = "null";
        setSparkleValue(0);
        setIsKeyItem(false);
        setIsWeapon(false);
        
    }

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the itemUse
     */
    public String getItemUse() {
        return itemUse;
    }

    /**
     * @param itemUse the itemUse to set
     */
    public void setItemUse(String itemUse) {
        this.itemUse = itemUse;
    }

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", itemUse=" + itemUse + "]";
	}

	/**
	 * @return the sparkleValue
	 */
	public int getSparkleValue() {
		return sparkleValue;
	}

	/**
	 * @param sparkleValue the sparkleValue to set
	 */
	public void setSparkleValue(int sparkleValue) {
		this.sparkleValue = sparkleValue;
	}
    /*
	public void dismantle(Item item)
	{
		setSparkleCounter( + item.getSparkleValue());
	}*/

	/**
	 * @return the isKeyItem
	 */
	public boolean isKeyItem() {
		return isKeyItem;
	}

	/**
	 * @param isKeyItem the isKeyItem to set
	 */
	public void setIsKeyItem(boolean isKeyItem) {
		this.isKeyItem = isKeyItem;
	}

	/**
	 * @return the isWeapon
	 */
	public boolean isWeapon() {
		return isWeapon;
	}

	/**
	 * @param isWeapon the isWeapon to set
	 */
	public void setIsWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}
    
    
}