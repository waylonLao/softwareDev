package MainCode;

import java.util.ArrayList;

/**
 *
 * @author Theos
 */
public class Inventory {
    
    private ArrayList keyItemInventory = new ArrayList<Item>();
    private ArrayList consumableInventory = new ArrayList<Item>();

    /**
     * @return the keyItemInventory
     */
    public ArrayList getKeyItemInventory() {
        return keyItemInventory;
    }

    /**
     * @param keyItemInventory the keyItemInventory to set
     */
    public void setKeyItemInventory(ArrayList keyItemInventory) {
        this.keyItemInventory = keyItemInventory;
    }

    /**
     * @return the consumableInventory
     */
    public ArrayList getConsumableInventory() {
        return consumableInventory;
    }

    /**
     * @param consumableInventory the consumableInventory to set
     */
    public void setConsumableInventory(ArrayList consumableInventory) {
        this.consumableInventory = consumableInventory;
    }
    
}