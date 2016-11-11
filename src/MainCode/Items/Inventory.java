package MainCode.Items;


import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Inventory implements Serializable{
    
    private ArrayList<Item> keyItemInventory;
    private ArrayList<Item> consumableInventory;

    public Inventory()
    {
    	this.keyItemInventory = new ArrayList<Item>();
    	this.consumableInventory = new ArrayList<Item>();
    }
    /**
     * @return the keyItemInventory
     */
    public ArrayList<Item> getKeyItemInventory() {
        return keyItemInventory;
    }

    /**
     * @param keyItemInventory the keyItemInventory to set
     */
    public void setKeyItemInventory(ArrayList<Item> keyItemInventory) {
        this.keyItemInventory = keyItemInventory;
    }

    /**
     * @return the consumableInventory
     */
    public ArrayList<Item> getConsumableInventory() {
        return consumableInventory;
    }

    /**
     * @param consumableInventory the consumableInventory to set
     */
    public void setConsumableInventory(ArrayList<Item> consumableInventory) {
        this.consumableInventory = consumableInventory;
    }

    public void addItem(Item item)
    {
    	consumableInventory.add(item);
    }
    public void addKeyItem(Item item)
    {
    	keyItemInventory.add(item);
    }
    
    public void showInventory()
    {
    	consumableInventory.toString();
    }
    
 @Override
	public String toString() {
		return "Inventory [keyItemInventory=" + keyItemInventory + ", consumableInventory=" + consumableInventory + "]";
	}
	public static void main(String[] args)
    {
    	Inventory iV = new Inventory();
    	ItemFactory iF = new ItemFactory();
    	
    	iV.addItem(iF.manufactureItem(75));
    	iV.addItem(iF.manufactureItem(50));
    	iV.addItem(iF.manufactureItem(100));
    	iV.addItem(iF.manufactureItem(100));
    	
    	iV.showInventory();
    	
    	System.out.println(iV);
    	
    }
}