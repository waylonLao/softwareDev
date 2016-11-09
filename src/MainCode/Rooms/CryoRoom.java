/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

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
			setRoomName("Cryo Room");
			setRoomDescription("First time description: You begin waking up, your eyes are gritty and your head is foggy. "
					+ " You glance around and unease starts to creep in.  You were supposed to be at a new planet, there should be others around, and more light or sounds, "
					+ "anything.  Gingerly you sit up and unhook yourself, you call out but the only response is your own voice echoing back to you.  "
					+ "The lights are dim and you can’t even hear the whooshing that would indicate the environmental system is running.  "
					+ "The other chambers are still closed and hold crew members who appear to still be in stasis.  "
					+ "You begin to think something must have happened to the ship so you get up to investigate and you find a red key card that’s been thrown to the ground. "
					+ "After a few minutes to orient yourself you realize that the red door leads up towards Security which you know holds extra command center key cards.  "
					+ "Thanks to your knowledge of the ship you know you need to get to the AI to figure out what happened and why you're the only crew member awake."
					+ " All other times: The room has 4 doors and each door has a name plate above it.  To the west is a yellow door marked, to the east is a blue door both marked Hallway."
					+ "The south holds a grey door labeled Command Center and to the north is a red door labeled Cryogenics Room");
		}
		else if(a == 1)
		{
			setRoomName("Cryo Room 1");
			setRoomDescription("The walls are dull grey and lined with the stasis units for other crew members, "
					+ "they too appear fine, just out.  When you enter the room you're attacked by a Rouge Cleaning Unit. "
					+ " You Pick up the lead pipe to start attacking with The room has 4 doors and each door has a name plate above it. "
					+ " To the west and east there are black doors, the west is labeled Engine Room and the east is labeled Ship AI.  "
					+ "To the north and south are red doors labeled Cryogenics Room");
		}
		else if(a == 2)
		{
			setRoomName("Cryo Room 2");
			setRoomDescription("The crew in this rooms appears to be fine as well, sleeping in their chambers."
					+ "The room is a dull metal grey with four doors each with a name plate. "  
					+ "To the west and east there are black doors, the west is labeled Engine Room and the east is labeled Ship AI.  "
					+ "To the north and south are red doors labeled Cryogenics Room");
		}
		else if(a == 3)
		{
			setRoomName("Cryo Room 3");
			setRoomDescription("The room is a dull metal grey with three doors each with a name plate.  "
					+ "To the north and south are red doors both labeled Cryogenics Room.  "
					+ "To the east is a blue door labeled Hallway.  "
					+ "The walls are lined with the stasis units for other crew members.");
		}
		else if(a == 4)
		{
			setRoomName("Cryo Room 4");
			setRoomDescription("The room is dull metal grey with two doors, one to the north and one to the south.  "
					+ "They are both red and labeled Cryogenics Room. "
					+ "The crew in this room appears fine.");
		}
		else if(a == 5)
		{
			setRoomName("Cryo Room 5");
			setRoomDescription("The room is dull metal grey with three doors, the north and south door are both red.  "
					+ "The south door is labeled Cryogenics and the north is Hallway.  "
					+ "The door to the east is the same dull grey as the rest of the ship but there appears to be a window near the top.  "
					+ "You give the stasis chambers a quick glance to ensure the crew is fine then go to check the window.   "
					+ "The window is small but you can just make out what appears to be a room with something in it. "
					+ " As you step back your foot catches against something on the floor.  "
					+ "Upon inspection, you realize there is an anchor point on the floor next to the door.");
		}
	}

}
