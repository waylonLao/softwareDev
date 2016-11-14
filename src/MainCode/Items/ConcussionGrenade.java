package MainCode.Items;

import MainCode.Monster.Sprite;

/**
 * @author Neal Klemenc
 */
public class ConcussionGrenade extends Item{

	
	public ConcussionGrenade() {
		super();
		setItemName("Concussion Grenade");
		setItemDescription("A powerful stun grenade.");
		setItemUse("You throw out a concussion grenade.");
	}

	public void itemFuction(Sprite target){
		target.setStunDuration(2);
	}
	




}
