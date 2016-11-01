package MainCode;
/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
class Item {
    
	private int itemID;
    private String itemName;
    private String itemDescription;
    private String itemUse;
    private int sparkleValue;
    
    public Item()
    {
        itemID = 0;
        itemName = "null";
        itemDescription = "null";
        itemUse = "null";
        setSparkleValue(0);
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
    
    
}