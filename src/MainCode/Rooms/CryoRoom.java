/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.LeadPipe;
import MainCode.Items.RedCard;
import MainCode.Monster.RogueCleaningUnit;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class CryoRoom extends Room{
	
	public CryoRoom(int a)
	{
		setQuickJumpCapable(false);
		
		if(a == 0)
		{
			setNumberOfExits(4);
			setRoomName("\nCryo Room");
			setRoomDescription("\n\nYou wake up, your eyes are gritty and your head is foggy. "
					+ "\nYou glance around and unease starts to creep in.  You were supposed to be at a new planet, "
					+ "\nthere should be others around, and more light or sounds, anything.  Gingerly you sit up and "
					+ "\nunhook yourself, you call out but the only response is your own voice echoing back to you.  "
					+ "\nThe lights are dim and you can’t even hear the whooshing that would indicate the environmental "
					+ "\nsystem is running. The other chambers are still closed and hold crew members who appear to still "
					+ "\nbe in stasis. You begin to think something must have happened to the ship so you get up to investigate "
					+ "\nand you find a red key card that’s been thrown to the ground. After a few minutes to orient yourself "
					+ "\nyou realize that the red door leads up towards Security which you know holds extra command center key cards.  "
					+ "\nThanks to your knowledge of the ship you know you need to get to the AI to figure out what happened and "
					+ "\nwhy you're the only crew member awake. All other times: The room has 4 doors and each door has a name "
					+ "\nplate above it.  To the west is a yellow door marked, to the east is a blue door both marked Hallway."
					+ "\nThe south holds a grey door labeled Command Center and to the north is a red door labeled Cryogenics Room");
			addItem(new RedCard());
		}
		else if(a == 1)
		{
			setNumberOfExits(4);
			setRoomName("\n\nCryo Room 1");
			setRoomDescription("\n\nThe walls are dull grey and lined with the stasis units for other crew members, "
					+ "\nthey too appear fine, just out.  When you enter the room you're attacked by a Rouge Cleaning Unit. "
					+ "\nYou Pick up the lead pipe to start attacking with The room has 4 doors and each door has a name plate above it. "
					+ "\nTo the west and east there are black doors, the west is labeled Engine Room and the east is labeled Ship AI.  "
					+ "\nTo the north and south are red doors labeled Cryogenics Room");
			//addItem(new LeadPipe());
			//addMonster(new RogueCleaningUnit());
		}
		else if(a == 2)
		{
			setNumberOfExits(4);
			setRoomName("\n\nCryo Room 2");
			setRoomDescription("\n\nThe crew in this rooms appears to be fine as well, sleeping in their chambers."
					+ "\nThe room is a dull metal grey with four doors each with a name plate. " 
					+ "\nTo the west and east there are black doors, the west is labeled Engine Room and the east is labeled Ship AI.  "
					+ "\nTo the north and south are red doors labeled Cryogenics Room");
		}
		else if(a == 3)
		{
			setNumberOfExits(3);
			setRoomName("\n\nCryo Room 3");
			setRoomDescription("\n\nThe room is a dull metal grey with three doors each with a name plate.  "
					+ "\nTo the north and south are red doors both labeled Cryogenics Room.  "
					+ "\nTo the east is a blue door labeled Hallway.  "
					+ "\nThe walls are lined with the stasis units for other crew members.");
		}
		else if(a == 4)
		{
			setNumberOfExits(2);
			setRoomName("\n\nCryo Room 4");
			setRoomDescription("\n\nThe room is dull metal grey with two doors, one to the north and one to the south.  "
					+ "\nThey are both red and labeled Cryogenics Room. "
					+ "\nThe crew in this room appears fine.");
		}
		else if(a == 5)
		{
			setNumberOfExits(3);
			setRoomName("\n\nCryo Room 5");
			setRoomDescription("\n\nThe room is dull metal grey with three doors, the north and south door are both red.  "
					+ "\nThe south door is labeled Cryogenics and the north is Hallway.  "
					+ "\nThe door to the east is the same dull grey as the rest of the ship but there appears to be a window near the top.  "
					+ "\nYou give the stasis chambers a quick glance to ensure the crew is fine then go to check the window.   "
					+ "\nThe window is small but you can just make out what appears to be a room with something in it. "
					+ "\nAs you step back your foot catches against something on the floor.  "
					+ "\nUpon inspection, you realize there is an anchor point on the floor next to the door.");
		}
	}

}
