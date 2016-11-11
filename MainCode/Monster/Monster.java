package MainCode.Monster;


import MainCode.Items.Item;
import MainCode.Items.Weapon;
import MainCode.Rooms.Room;

/**
* @author nklemenc
*/
public class Monster extends Sprite {

	private String monsterDescription;
	private Item itemDrop;
	
	public Monster(int h, Weapon w, String n, String md, Item i)
	{
		super(h,w,n);
		monsterDescription = md;
		itemDrop = i;
	}
	
	/**
	 * @param monsterID
	 * @param monsterName
	 * @param monsterDescription
	 * @param itemDrop
	 */
	/*public Monster(int health, Weapon weapon, int monsterId, 
			String name, String monsterDescription)// Item itemDrop)
	{
	
		super(health, weapon, name);
		this.monsterID = 0;
		this.monsterDescription = "null";
		//this.itemDrop = "null";
	}*/
	


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



	public Item getItemDrop() {
		return itemDrop;
	}

	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}
	



	
	
}
