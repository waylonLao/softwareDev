package MainCode.GUI;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import MainCode.Game;
import MainCode.Rooms.*;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class MainGUI extends Application {
	
	Game game;
	MainMenuGUI mainMenu;
	HelpGui helpGui;

	public Game getGame()
	{
		return game;
	}

	public void setGame(Game game)
	{
		this.game = game;
	}

	@Override
	public void start(Stage primaryStage){
		
		
		try{
			game = new Game();
			mainMenu = new MainMenuGUI();
			mainMenu.setGame(game);
			helpGui = new HelpGui();
			helpGui.setGame(game);
		
		RoomArray masterRoomArray = new RoomArray();

		TextField tf1 = new TextField();

		//This my good sir is how you do it
		Text text = new Text(masterRoomArray.getRoomArray().get(0).getRoomName());
		Text roomText = new Text(masterRoomArray.getRoomArray().get(0).getRoomDescription());
		Text battleText = new Text();
		text.setFont(new Font(20));
		text.setWrappingWidth(200);
		text.setTextAlignment(TextAlignment.JUSTIFY);
		//text.setText("How do I link this to MainMenuGui???");
		
		//text.setText();
		

		StackPane.setAlignment(text, Pos.TOP_CENTER);
		StackPane.setAlignment(roomText, Pos.CENTER);
		StackPane.setAlignment(tf1, Pos.BOTTOM_CENTER);
		StackPane root = new StackPane();
		root.getChildren().addAll(tf1, text, roomText);


		Scene scene = new Scene(root, 500, 500);

		primaryStage.setTitle("Galaxy Explorer");
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception e){
			
		}
	}
		/*tf1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//syso to see what is actually printed out
				//System.out.println(tf1.getCharacters());
				if ("save".equals(tf1.getCharacters().toString()))
				{
					game.saveGame();
					text.setText("Game Saved!");
					tf1.clear();
				} else if ("exit".equals(tf1.getCharacters().toString()))
				{
						try
						{
							mainMenu.start(primaryStage);
							
						} catch (Exception e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				} else if ("help".equals(tf1.getCharacters().toString()))
				{
					try
					{
						helpGui.start(primaryStage);
					} catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			catch (Exception e)
			{
				
			}
		*/

	/**
	 * @param args the command line arguments
	 */
	public void main(String[] args) {
		launch(args);
	}}