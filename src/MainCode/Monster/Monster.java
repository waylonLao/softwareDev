package MainCode.Monster;


import MainCode.Weapon;

/**
* @author nklemenc
*/
public class Monster extends Sprite {

	protected int monsterID;
	private String monsterName;
	private String monsterDescription;
	//private Item itemDrop;
	
	public Monster()
	{
		super();
		this.monsterID = 0;
		this.monsterName = "null";
		this.monsterDescription = "null";
	}
	
	/**
	 * @param monsterID
	 * @param monsterName
	 * @param monsterDescription
	 * @param itemDrop
	 */
	public Monster(int health, Weapon weapon, int monsterId, 
			String name, String monsterDescription)// Item itemDrop)
	{
	
		super(health, weapon, name);
		this.monsterID = 0;
		this.monsterDescription = "null";
		//this.itemDrop = "null";
	}
	

	public void setMonsterName(String monsterName)
	{
		// TODO Auto-generated method stub
		this.monsterName = monsterName;
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
	/*public Item getItemDrop() {
		return itemDrop;
	}
	*//**
	 * @param itemDrop the itemDrop to set
	 *//*
	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}*/
	@Override
	public String toString() {
		return "Monster [monsterID=" + monsterID + ", monsterDescription=" + monsterDescription 
				+  "]";
	}
	
}
