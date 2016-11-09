package MainCode.Items;



/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Item{
    

    private String itemName;
    private String itemDescription;
    private String itemUse;
    
    
    public Item(){
    	
    }
    
    public Item(String name, String description, String use)
    {
    	
    	itemName = name;
    	itemDescription = description;
    	itemUse = use;
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





	
	
	

    
    
}