package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class ConcussionGrenade extends Consumable implements ItemInterface{

	public ConcussionGrenade() {
		super();
		setItemName("Concussion Grenade");
		setItemDescription("A powerful stun grenade.");
		setItemUse("Use to stun monster for a turn.");
		setSparkleValue(1);
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
