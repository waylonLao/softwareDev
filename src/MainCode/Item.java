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
    
    public Item()
    {
        itemID = 0;
        itemName = "null";
        itemDescription = "null";
        itemUse = "null";
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
    
    
    
}