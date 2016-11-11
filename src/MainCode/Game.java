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

import MainCode.Items.*;
import MainCode.Monster.*;
import MainCode.Rooms.*;

public class Game
{
	ObjectOutputStream outputs;
	ObjectInputStream inputs;
	
	public void saveGame() throws FileNotFoundException, IOException
	{
		outputs = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
		//Hard coding the objects in.
		outputs.writeObject(new Player(500, new LeadPipe()));
		outputs.writeObject(new Room(3,"A test room", new LeadPipe(), new AlienCommando(), false, true));
	}
	
	public void loadGame() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		inputs = new ObjectInputStream(new FileInputStream("gameSave.dat"));
		//Hard coding the toString, may need to change to loop
		System.out.println(inputs.readObject());
		System.out.println("|----------------------|");
		System.out.println(inputs.readObject());
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try
		{
		Game game = new Game();
		game.saveGame();
		game.loadGame();
		}
		finally
		{
			System.out.println("fail??");
		}
	}
	
}
