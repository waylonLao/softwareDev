package MainCode;


import java.util.ArrayList;


/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Inventory {
    
    private ArrayList<Item> keyItemInventory = new ArrayList<Item>();
    private ArrayList<Item> consumableInventory = new ArrayList<Item>();

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
}