package MainCode.Items;


import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author Neal Klemenc
 */
public class Inventory implements Serializable{
    
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public Inventory()
    {
    	
    }
    
    
	/**
	 * @return the itemList
	 */
	public ArrayList<Item> getItemList() {
		return itemList;
	}




	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}




	public void addItem(Item i){
		itemList.add(i);
		
	}
	
	public void removeItem(Item i){
		itemList.remove(i);
	}
	
	
}