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

package MainCode.GUI;

import MainCode.Game;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelpGui extends Application
{
	Game game;
	private Stage primaryStage;
	@FXML private Label label;
	
	@Override
	public void start(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		
		//Make the title, make it pretty, and center it
		Label title = new Label("Help Menu");
		title.setFont(Font.font("Arial", 40));
		title.setPadding(new Insets(20, 0, 0, 0));
		title.setMaxWidth(Double.MAX_VALUE);
		title.setAlignment(Pos.CENTER);

		Text text = new Text();
		text.setText("Helpful commands here");

		//Add label and box to border pane
		BorderPane bp= new BorderPane();
		bp.setCenter(text);
		bp.setTop(title);

		Scene scene = new Scene(bp, 500, 500);

		primaryStage.setTitle("Galaxy Explorer");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public Stage getStage()
	{
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void setGame(Game game)
	{
		// TODO Auto-generated method stub
		
	}


}
