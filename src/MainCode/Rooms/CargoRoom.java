/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class CargoRoom extends Room{

	public CargoRoom(int a)
	{
		setQuickJumpCapable(false);
		
		if(a == 1)
		{
			setNumberOfExits(2);
			setRoomName("Cargo 1");
			setRoomDescription("This is a dull grey room lined with empty cargo crates. "
					+ "There are two doors in this room, one yellow door to the north and "
					+ "a black door to the east.");
		}
		else if(a == 2)
		{
			setNumberOfExits(2);
			setRoomName("Cargo 2");
			setRoomDescription("This is a dull grey room with empty shelves, a yellow door "
					+ "to the north that leads to cargo3 and a yellow door to the south that "
					+ "leads to Cargo 1.");
		}
		else if(a == 3)
		{
			setNumberOfExits(2);
			setRoomName("Cargo 3");
		}
	}
}
