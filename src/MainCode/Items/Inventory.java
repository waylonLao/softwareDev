package MainCode.Items;


import java.util.ArrayList;


/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Inventory {
    
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
		if(i != null){
		itemList.add(i);
		}
	}
	
	public void removeItem(Item i){
		itemList.remove(i);
	}
	
	
}