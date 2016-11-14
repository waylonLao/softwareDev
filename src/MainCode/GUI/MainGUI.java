package MainCode.GUI;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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

		//Putting HelpGui into MainGui
		//Make the title, make it pretty, and center it
		Label title1 = new Label("Help Menu");
		title1.setFont(Font.font("Arial", 40));
		title1.setPadding(new Insets(20, 0, 0, 0));
		title1.setMaxWidth(Double.MAX_VALUE);
		title1.setAlignment(Pos.CENTER);

		Text text1 = new Text();
		text1.setText("Helpful commands here");

		//Add label and box to border pane for HelpGui
		BorderPane bp1= new BorderPane();
		bp1.setCenter(text1);
		bp1.setTop(title1);


		Stage stage = new Stage();
		stage.setTitle("Help");
		stage.setScene(new Scene(bp1, 400, 500));
		//stage.show();


		StackPane.setAlignment(text, Pos.TOP_CENTER);
		StackPane.setAlignment(roomText, Pos.CENTER);
		StackPane.setAlignment(tf1, Pos.BOTTOM_CENTER);
		StackPane root = new StackPane();
		root.getChildren().addAll(tf1, text, roomText);


		Scene scene = new Scene(root, 800, 500);

		primaryStage.setTitle("Galaxy Explorer");
		primaryStage.setScene(scene);
		primaryStage.show();


		tf1.setOnAction(new EventHandler<ActionEvent>() {
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
						//helpGui.start(primaryStage);
						stage.show();
					} catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if("north".equals(tf1.getCharacters().toString()))
				{
					game.setRoom(masterRoomArray.getRoomArray().get(1));
					text.setText(masterRoomArray.getRoomArray().get(1).getRoomName());
					roomText.setText(masterRoomArray.getRoomArray().get(1).getRoomDescription());
				}
			}
		});
	}


	/**
	 * @param args the command line arguments
	 */
	public void main(String[] args) {
		launch(args);
	}

}