package MainCode.Items;

import java.io.Serializable;

/**
 * @author Neal Klemenc
 */
public class Item implements Serializable{
    

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
    
//    public String itemFunction(){
//    	return "something";
//    }
    
    @Override
    public String toString(){
    	return this.getItemName();
    }





	
	
	

    
    
}