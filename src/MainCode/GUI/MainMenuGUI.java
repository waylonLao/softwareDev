package MainCode.GUI;

import javax.swing.GroupLayout.Alignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MainMenuGUI extends Application{
	
	MainGUI mg = new MainGUI();
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{	
		//Make the buttons
		Button newGame = new Button("New Game");
		Button loadGame = new Button("Load Game");
		Button help = new Button("Help");
		Button quit= new Button("Quit");
		
		//Align buttons
		newGame.setMaxWidth(Double.MAX_VALUE);
		loadGame.setMaxWidth(Double.MAX_VALUE);
		help.setMaxWidth(Double.MAX_VALUE);
		quit.setMaxWidth(Double.MAX_VALUE);
		
		//Make the title, make it pretty, and center it
		Label title = new Label("Galaxy Explorer");
		title.setFont(Font.font("Arial", 40));
		title.setPadding(new Insets(20, 0, 0, 0));
		title.setMaxWidth(Double.MAX_VALUE);
		title.setAlignment(Pos.CENTER);
		
		//Add buttons to vertical box
		VBox vB1 = new VBox();
		vB1.getChildren().addAll(newGame, loadGame, help, quit);
		vB1.setSpacing(70);
		vB1.setPadding(new Insets(120, 100, 10, 100));
		
		//Add label and box to border pane
		BorderPane bp= new BorderPane();
		bp.setCenter(vB1);
		bp.setTop(title);
		
		//Set up the stage
		Scene scene = new Scene(bp, 800, 600);
		primaryStage.setTitle("Galaxy Explorer");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
		
		newGame.setOnAction(e -> mg.start(primaryStage));
		/*loadGame.setOnAction(e -> );
		help.setOnAction(e -> );*/
		quit.setOnAction(e -> primaryStage.close());
		
		

	}
	
	public static void main(String[] args)
	{
		
		launch(args);
		

	}

	
}


