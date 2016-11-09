/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.ECell;
import MainCode.Puzzles.BinaryPuzzle;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class Hallway extends Room{
	
	public Hallway(int a)
	{
		setQuickJumpCapable(false);
		
		if(a == 0)
		{
			setRoomName("Hallway");
			setRoomDescription("The room is grey with two exits, a red door to the south labeled Cryogenics "
					+ "and another red door to the east labeled Hallway.  "
					+ "In the far corner is a crate with a slowing blinking light on the front.  "
					+ "When the light blinks on you can see a number pad underneath.");
			addItem(new ECell());
			addPuzzle(new BinaryPuzzle());
		}
		else if(a == 1)
		{
			setRoomName("Hallway 1");
			setRoomDescription();
			
		}
		else if(a == 2)
		{
			setRoomName("Hallway 2");
			setRoomDescription();
		}
		else if(a == 3)
		{
			setRoomName("Hallway 3");
			setRoomDescription();
		}
		else if(a == 4)
		{
			setRoomName("Hallway 4");
			setRoomDescription();
		}
	}

}
