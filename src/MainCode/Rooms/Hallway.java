/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.BlueCard;
import MainCode.Items.ECell;
import MainCode.Monster.CyborgPirate;
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
			setRoomDescription("The grey walls continue into this room as do the red doors.  "
					+ "he west and east doors are labeled Hallway.  "
					+ "When you enter you're attacked by cyborg pirate. "
					+ "Once you defeat the monster it drops a blue key card.");
			addItem(new BlueCard());
			addMonster(new CyborgPirate());
			
		}
		else if(a == 2)
		{
			setRoomName("Hallway 2");
			setRoomDescription("The walls are grey and there are two doors, "
					+ "the west door is read and labeled Hallway "
					+ "and the red east door, much to your relief, is labeled Security.");	
		}
		else if(a == 3)
		{
			setRoomName("Hallway 3");
			setRoomDescription("Another hallway with dull gray walls. "
					+ "Each door in the room has a nameplate above it, "
					+ "the blue door to the West reads To Cryo Room, "
					+ "and the Blue door to the East reads To Server Rooms.");
		}
		else if(a == 4)
		{
			setRoomName("Hallway 4");
			setRoomDescription("Like most of the hallways on the ship this is another dull gray walled room.  "
					+ "There is a E-Cell crate sitting on its side in the far corner of the room. "
					+ "Each door in the room has a nameplate above it; the blue door to the West reads "
					+ "To Cryo Room, and the Blue door to the East reads Server Room 4.");
			addItem(new ECell());
			addPuzzle(new BinaryPuzzle());
		}
	}

}
