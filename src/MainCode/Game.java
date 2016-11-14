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
		outputs.writeObject(new Player(500, new LeadPipe(), null));
		outputs.writeObject(new Room());
	}
	
	public void loadGame() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		inputs = new ObjectInputStream(new FileInputStream("gameSave.dat"));
		System.out.println(inputs.readObject());
		System.out.println("-----------------");
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
