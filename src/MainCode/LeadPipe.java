package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class LeadPipe extends Weapon implements ItemInterface{

	public LeadPipe()
	{
		setItemName("Lead Pipe");
		setItemDescription("A long heavy pipe made out of lead.");
		setItemUse("Equip to fight monsters.");
	}
	
	@Override
	public String toString() {
		return getItemName() + "\n" + getItemDescription() + "\n" + getItemUse();
	}

}
