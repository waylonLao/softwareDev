package MainCode;

public class ConcussionGrenade extends Item implements ItemInterface{

	public ConcussionGrenade() {
		super();
		setItemName("Concussion Grenade");
		setItemDescription("A powerful stun grenade.");
		setItemUse("Use to stun monster for a turn.");
		// TODO Auto-generated constructor stub
	}

	public Item createConcussionGrenade()
	{
		ConcussionGrenade cG = new ConcussionGrenade();
		return cG;
		
	}
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
