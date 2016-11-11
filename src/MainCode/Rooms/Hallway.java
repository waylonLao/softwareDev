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
			setNumberOfExits(2);
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
			setNumberOfExits(2);
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
			setNumberOfExits(2);
			setRoomName("Hallway 2");
			setRoomDescription("The walls are grey and there are two doors, "
					+ "the west door is read and labeled Hallway "
					+ "and the red east door, much to your relief, is labeled Security.");	
		}
		else if(a == 3)
		{
			setNumberOfExits(2);
			setRoomName("Hallway 3");
			setRoomDescription("Another hallway with dull gray walls. "
					+ "Each door in the room has a nameplate above it, "
					+ "the blue door to the West reads To Cryo Room, "
					+ "and the Blue door to the East reads To Server Rooms.");
		}
		else if(a == 4)
		{
			setNumberOfExits(3);
			setRoomName("Hallway 4");
			setRoomDescription("Like most of the hallways on the ship this is another dull gray walled room.  "
					+ "There is a E-Cell crate sitting on its side in the far corner of the room. "
					+ "Each door in the room has a nameplate above it; the blue door to the West reads "
					+ "To Cryo Room, and the Blue door to the East reads Server Room 4.");
			addItem(new ECell());
			addPuzzle(new BinaryPuzzle());
		}
		else if(a == 5)
		{
			setNumberOfExits(2);
			setRoomName("Hallway 5");
			setRoomDescription("The walls of this hallway are a uniform grey throughout. "
					+ "Only about a quarter of the lights are working, so it is fairly dark. "
					+ "The door to the west has the words Cryogenics Room written above it, "
					+ "and to the east, there is the rest of the hallway leading to a server bank.");
		}
		else if(a == 6)
		{
			setNumberOfExits(3);
			setRoomName("Hallway 6");
			setRoomDescription("If 10M not fought) The hallway towards Communications is long, and includes two sections. "
					+ "The walls are a neutral grey in color, with the outlines of wall panels visible in some places. "
					+ "In the northeast corner of this hallway, near the cryo room door, sits an energy cell chest. "
					+ "(If 10M fought) This section of the hallway seems more damaged than the other. "
					+ "There are panels missing from the walls, with severed, sparking wires protruding from them, "
					+ "and the walkway is deformed. The energy cell chest that was in the corner is crushed along with that entire wall. "
					+ "(Note, if you somehow managed to get through here without getting the cell, it is now permanently lost) "
					+ "To the west is to the second section of the hallway towards the comm room, and to the east is the cryo room. "
					+ "The door to the north has the word Engine written over it.");
			addItem(new ECell());
			addPuzzle(new BinaryPuzzle());
			
		}
		else if(a == 7)
		{
			setNumberOfExits(3);
			setRoomName("Hallway 7");
			setRoomDescription("If 10M not fought) The second section of the hallway towards the com room seems "
					+ "identical to the first, though it is missing the energy cell chest. "
					+ "(If 10M fought) The second section of the hallway towards the comm room shows signs "
					+ "of the recent attack, with sections of the outer hull visibly bent inward. "
					+ "To the west is Communications, and to the rest of the hallway towards the cryo room. "
					+ "The door to the north has the word Engine written over it.");
		}
		else if(a == 8)
		{
			setNumberOfExits(3);
			setRoomName("Hallway 8");
		}
		else if(a == 9)
		{
			setNumberOfExits(3);
			setRoomName("Hallway 9");
		}
	}

}
