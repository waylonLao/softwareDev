/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Monster.SpaceKraken;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class ShipWeapons extends Room{
	
	public ShipWeapons()
	{
		setQuickJumpCapable(true);
		setRoomName("Ship Weapons");
		setRoomDescription("The walls in this room are formed by dark paneling, "
				+ "but the lights are almost bright enough to hurt your eyes. "
				+ "There are quite a few terminals in this room as well, "
				+ "with a large table in the center which projects various holographic images above it. "
				+ "The panels cover every inch of the interior, with the exception of the western wall, "
				+ "which is a large window."
				+ "(If skipped Communications Puzzle and have not fought 10M yet)"
				+ "Without warning, the ship shakes violently, and you hear several alarms go off. "
				+ "A massive tentacle slams into the window with a loud crushing sound, visibly distorting the entire room."
				+ " As you regain your balance, a gigantic, horrible eye stares through the window at you. (start 10M battle) "
				+ "Each door in the room has a nameplate above it; the door to the north reads Cargo, the room to the east reads Engine,"
				+ " and the door to the south reads Communications.");
		addMonster(new SpaceKraken());
	}

}
