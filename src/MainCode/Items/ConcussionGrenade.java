package MainCode.Items;

import MainCode.Monster.Sprite;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class ConcussionGrenade extends Consumable implements ItemInterface{

	private boolean isKeyItem;
	
	public ConcussionGrenade() {
		super();
		setItemName("Concussion Grenade");
		setItemDescription("A powerful stun grenade.");
		setItemUse("You throw out a concussion grenade.");
		setSparkleValue(1);
		this.isKeyItem = false;
		// TODO Auto-generated constructor stub
	}

	public Item createConcussionGrenade()
	{
		ConcussionGrenade cG = new ConcussionGrenade();
		return cG;
		
	}
	
	public boolean isKeyItem()
	{
		return isKeyItem;
	}

	public void setKeyItem(boolean isKeyItem)
	{
		this.isKeyItem = isKeyItem;
	}
	
	public void itemFuction(Sprite target){
		target.setStunDuration(2);
	}
	
	@Override
	public String toString() {
		return "\n" + getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

	@Override
	public void createItem() {
		ConcussionGrenade cG = new ConcussionGrenade();
	}

}
