/**
 * Josh Tran
 * Date: Nov 1, 2016
 */
package MainCode.Items;

/**
 * @author Joshua Tran
 * Date: Nov 1, 2016
 */
public class Consumable extends Item implements ItemInterface{
	
	public boolean canUseInBattle;
	
	public Consumable()
	{
		canUseInBattle = true;
	}

	@Override
	public void createItem() {
		// TODO Auto-generated method stub
		
	}

}
