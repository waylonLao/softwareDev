package MainCode;

public class ConcussionGrenade extends Item implements ItemInterface{

	public ConcussionGrenade(int itemID) {
		super(itemID);
		// TODO Auto-generated constructor stub
	}
	
	public Item createConcussionGrenade()
	{
		Item grenade = new Item(2);
		grenade.setItemName("Concussion Grenade");
		grenade.setItemDescription("A powerful stun grenade");
		grenade.setItemUse("Use to stun monster for a turn");
		return null;
		
	}

}
