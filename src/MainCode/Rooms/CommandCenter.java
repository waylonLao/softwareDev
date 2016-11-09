/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Monster.TunnelingHorror;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class CommandCenter extends Room{

	public CommandCenter()
	{
		setRoomName("Command Center");
		setRoomDescription("When you enter, the room is lit only by back power making it very dim. "
				+ "Knowing where the energy cell for the room goes you turn right and begin to make your "
				+ "way cautiously along the wall until you hit the console along the west wall.  "
				+ "Once there you kneel down and pry open the panel that holds the dead energy cell, "
				+ "you carefully pull it loose and set it to the side.  "
				+ "Pulling out your found cell you plug it in to the console.  T"
				+ "he lights come on and you turn to inspect the room."
				+ "The south wall holds a bank of consoles, in the center is a map of the ship showing which areas were damaged.  "
				+ "Upon inspection you realize none of the critical areas are beyond help, they all just appear to be low on power.  "
				+ "Since you've already powered the command center, the AI room doors have power and you unlock them from the console. "
				+ " You try to unlock the other doors as well but there isn't sufficient power in the ship yet. "
				+ "On the east side where normally sits extra storage crates there is a huge monster (3M).  "
				+ "The monster doesn't appear overly mobile but it is gnawing at the walls, which could become a "
				+ "problem given the rooms proximity to the edge of the ship.");
		addMonster(new TunnelingHorror());
	}
}
