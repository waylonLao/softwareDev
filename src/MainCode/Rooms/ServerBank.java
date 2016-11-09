/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class ServerBank extends Room{

	public ServerBank(int a)
	{
		setQuickJumpCapable(false);
		
		
		if(a == 1)
		{
			setRoomName("Server Bank 1");
			setRoomDescription("Besides the usual grey, the walls of this room are lined with blade servers, "
					+ "most of which remain relatively unscathed. The blue door to the west leads towards the cryogenic rooms, "
					+ "and the blue door to the south has a nameplate above it, reading Server Bank 2.");
		}
		else if(a == 2)
		{
			setRoomName("Server Bank 2");
			setRoomDescription("This room largely resembles the others, with black server racks occupying "
					+ "most of the space. Each door in the room has a nameplate above it; the black door to the west reads AI, "
					+ "the blue door to the north reads Server Bank 1, and the blue door to the south reads Server Bank 3");
		}
		else if(a == 3)
		{
			setRoomName("Server Bank 3");
			setRoomDescription("You're struck by how well this room is intact and seems to be in working order. "
					+ "All server banks seem to be powered on and communicating with the main system. "
					+ "Each door in the room has a nameplate above it; the blue door to the north reads Server Bank 2, "
					+ "the Blue door to the South reads Server Room 4, and the black door to the West reads AI");
		}
		else return;
	}
}
