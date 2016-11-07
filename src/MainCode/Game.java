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

import MainCode.Items.LeadPipe;
import MainCode.Monster.Player;

public class Game
{
	ObjectOutputStream outputs;
	ObjectInputStream inputs;
	
	public void saveGame() throws FileNotFoundException, IOException
	{
		outputs = new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
		outputs.writeObject(new Player(500, new LeadPipe()));
	}
	
	public void loadGame() throws FileNotFoundException, IOException
	{
		inputs = new ObjectInputStream(new FileInputStream("gameSave.dat"));
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException
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
