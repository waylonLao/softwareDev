package MainCode.Monster;


import MainCode.Items.Item;

/**
* @author nklemenc
*/
public class Monster extends Sprite {

	protected int monsterID;
	private String monsterName;
	private String monsterDescription;
	private Item itemDrop;
	private int monsterStrength;
	
	public Monster()
	{
		super();
		this.monsterID = 0;
		this.setMonsterName("null");
		this.monsterDescription = "null";
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

	@Override
	public String toString() {
		return "Monster: " + monsterName + ", monsterDescription=" + monsterDescription 
				+  "]";
	}

	public Item getItemDrop() {
		return itemDrop;
	}

	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	/**
	 * @return the monsterStrength
	 */
	public int getMonsterStrength() {
		return monsterStrength;
	}

	/**
	 * @param monsterStrength the monsterStrength to set
	 */
	public void setMonsterStrength(int monsterStrength) {
		this.monsterStrength = monsterStrength;
	}
	
}
