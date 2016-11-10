/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Rooms;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class Communications extends Room{
	
	public Communications()
	{
		setNumberOfExits(3);
		setQuickJumpCapable(true);
		setRoomName("Communicatiions");
		setRoomDescription("This room is a uniform drab grey like the others. "
				+ "A few computer terminals with blinking lights populate the otherwise sparsely furnished room. "
				+ "(If first entry) A large pair of monitors stand out among the rest, with the first one featuring what "
				+ "appears to be a sonar. It shows your ship as a white dot in the center, with various smaller grey dots spread out, "
				+ "probably debris. However, there is also a much larger red dot, which the computer has calculated is rapidly approaching. "
				+ "The second monitor displays a rapidly-scrolling command line interface. The window is titled Distress Signal Broadcast, "
				+ "and it just seems to be repeating the same error: Error: Radio Silence Initialization exited with error code 0x88D710F3. Extended signal broadcast may attract pests."
				+ " You might want to try turning this thing off."
				+ "(If gave up) There is no fixing it now. Hopefully it is harmless. "
				+ "To the east is the hallway leading to the cryogenic rooms, while the door to the north has the word Weapons written over it.");
		//addPuzzle();
	}

}
