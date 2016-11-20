package MainCode.Items;

import java.io.Serializable;

import MainCode.Monster.Sprite;

/**
 * @author Neal Klemenc
 */
public class ConcussionGrenade extends Item implements Serializable{

	
	public ConcussionGrenade() {
		super();
		setItemName("Concussion Grenade");
		setItemDescription("A powerful stun grenade.");
		setItemUse("You throw out a concussion grenade.");
	}

	public String itemFuction(Sprite target){
		target.setStunDuration(2);
		return "You daze the " + target.getName() + " with a Concussion Grenade.";
	}
	




}
