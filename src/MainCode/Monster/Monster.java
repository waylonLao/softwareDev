package MainCode.Monster;

import MainCode.Items.Item;
import MainCode.Items.Weapon;

/**
* @author nklemenc
*/
public class Monster extends Sprite {

	private int monsterID;
	private String monsterDescription;
	private Item itemDrop;
	private String monsterName;
	
	
	/**
	 * @param monsterID
	 * @param monsterName
	 * @param monsterDescription
	 * @param itemDrop
	 */
	public Monster(int health, Weapon wpn, int monsterID, String monsterName, String monsterDescription, Item itemDrop) {
		super(health, wpn, monsterName);
		this.monsterID = monsterID;
		this.monsterDescription = monsterDescription;
		this.itemDrop = itemDrop;
		this.setMonsterName(monsterName);
	}
	
	/**
	 * @return the monsterID
	 */
	public int getMonsterID() {
		return monsterID;
	}
	/**
	 * @param monsterID the monsterID to set
	 */
	public void setMonsterID(int monsterID) {
		this.monsterID = monsterID;
	}

	/**
	 * @return the monsterDescription
	 */
	public String getMonsterDescription() {
		return monsterDescription;
	}
	/**
	 * @param monsterDescription the monsterDescription to set
	 */
	public void setMonsterDescription(String monsterDescription) {
		this.monsterDescription = monsterDescription;
	}
	/**
	 * @return the itemDrop
	 */
	public Item getItemDrop() {
		return itemDrop;
	}
	/**
	 * @param itemDrop the itemDrop to set
	 */
	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}

	public String getMonsterName()
	{
		return monsterName;
	}

	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	
	
	
}
