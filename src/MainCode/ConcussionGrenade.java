package MainCode;

public class ConcussionGrenade extends Item implements ItemInterface{

	public ConcussionGrenade(int itemID) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ConcussionGrenade [createConcussionGrenade()=" + createConcussionGrenade() + "]";
	}

	public Item createConcussionGrenade()
	{
		Item grenade = new Item();
		grenade.setItemName("Concussion Grenade");
		grenade.setItemDescription("A powerful stun grenade");
		grenade.setItemUse("Use to stun monster for a turn");
		return null;
		
	}

}
