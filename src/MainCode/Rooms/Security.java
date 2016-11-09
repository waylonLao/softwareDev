/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.CarbonNanotubeRope;
import MainCode.Items.CommandCard;
import MainCode.Puzzles.MagicSquare;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class Security extends Room{
	
	public Security()
	{
		setQuickJumpCapable(true);
		setRoomName("Security");
		setRoomDescription("Just like the other rooms it is dull gray but with a flickering overhead light.  "
				+ "Looking around the room the all the monitors are static except for the one in the command center which appears to be in working order.  "
				+ "On the wall there is a rope and other items. "
				+ "Looking out the window you see an energy cell crate it's a room that appears to be leaking atmosphere into space. "
				+ "Remembering that there is an extra key card to the Command room you start to look around and find a vault under the desk.  "
				+ "Having never been told the code you try to hack into it by solving the magic square puzzle.");
		addItem(new CommandCard());
		addItem(new CarbonNanotubeRope());
		addPuzzle(new MagicSquare());
	}

}
