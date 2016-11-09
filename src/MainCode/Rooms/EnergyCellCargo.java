/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

import MainCode.Items.ECell;
import MainCode.Puzzles.LogicPuzzle;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class EnergyCellCargo extends Room{
	
	public EnergyCellCargo()
	{
		setRoomName("Energy Cell Cargo Room");
		setRoomDescription("This is a dull grey room with six empty Energy Cell crates and "
				+ "one locked energy crate. There is  a yellow door to the south that leads "
				+ "to cargo2 and a yellow door to the north that leads to viewing room1.");
		addItem(new ECell());
		addPuzzle(new LogicPuzzle());
	}

}
