/**Class: ITECH
	* @author Waylon Lao
	* @version 1.0
	* Course : ITEC 3150 Spring 2016
	* Written: January 18, 2012
	*
	*
	* This class – now describe what the class does
	*
	* Purpose: – Describe the purpose of this class
	*/

package MainCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Game
{
	ObjectOutputStream outputs;
	ObjectInputStream inputs;
	
	public void saveGame() throws FileNotFoundException, IOException
	{
		outputs = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
		//outputs.writeObject();
	}
	
	public void loadGame() throws FileNotFoundException, IOException
	{
		inputs = new ObjectInputStream(new FileInputStream("gameSave.dat"));
	}
	
}
