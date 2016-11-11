/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class Viewing extends Room{
	
	public Viewing(int a)
	{
		setQuickJumpCapable(false);
		
		if(a == 1)
		{
			setNumberOfExits(2);
			setRoomName("Viewing 1");
			setRoomDescription("This room has panoramic viewing windows, "
					+ "the length of the room. Through these windows one can "
					+ "see our indigenous galaxy. There is a yellow door to the "
					+ "south and a yellow door to the north.");
		}
		else if(a == 2)
		{
			setNumberOfExits(2);
			setRoomName("Viewing 2");
			setRoomDescription("This a dull grey room. This room has panoramic "
					+ "windows but the ships window shutters are closed. "
					+ "The north exit leads to the navigation room, the south exit "
					+ "leads to viewing room1.");
		}
	}

}
