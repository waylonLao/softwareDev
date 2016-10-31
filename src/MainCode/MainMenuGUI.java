package MainCode;

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
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{	
		Button newGame = new Button("New Game");
		Button loadGame = new Button("Load Game");
		Button help = new Button("Help");
		Button quit= new Button("Quit");
		
		newGame.setMaxWidth(Double.MAX_VALUE);
		loadGame.setMaxWidth(Double.MAX_VALUE);
		help.setMaxWidth(Double.MAX_VALUE);
		quit.setMaxWidth(Double.MAX_VALUE);
		
		Text text = new Text();
		text.setText("Galaxy Explorer");
		/*text.setTextAlignment(TextAlignment.CENTER);
		
		HBox textBox = new HBox();
		textBox.getChildren().addAll(text);
		textBox.setSpacing(70);
		textBox.setPadding(new Insets(120, 100, 10, 100));*/
		
		VBox vB1 = new VBox();
		vB1.getChildren().addAll(newGame, loadGame, help, quit);
		vB1.setSpacing(70);
		vB1.setPadding(new Insets(120, 100, 10, 100));
		
		BorderPane bp= new BorderPane();
		bp.setCenter(vB1);
		bp.setTop(text);
		
		Scene scene = new Scene(bp, 510, 600);
		primaryStage.setTitle("Galaxy Explorer");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
		
		/*newGame.setOnAction(e -> circle.setFill(Color.RED));
		loadGame.setOnAction(e -> circle.setFill(Color.BLUE));
		help.setOnAction(e -> circle.setFill(Color.GREEN));
		quit.setOnAction(e -> circle.setFill(Color.ORANGE));*/
		
		

	}
	
	public static void main(String[] args)
	{
		
		launch(args);
		

	}

	/*@Override
	public void start(Stage maninMenuStage) throws Exception {
		
		//create Label
		Label labelTitle = new Label();
		
		//label text
		labelTitle.setText("Galaxy Explorer");
		
		//create buttons
		Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		
		//create Stage
	    Stage mainMenuStage = new Stage();
	    
	    //button text
		b1.setText("New Game");
		b2.setText("Load Game");
		b3.setText("Options");
		b4.setText("Test");
		
		//create StackPane
		StackPane stackPane1 = new StackPane();
		
		//borderPane
		BorderPane border = new BorderPane();
		HBox hbox = addHBox();
		border.setTop(hbox);
		border.setLeft(addVBox());
		addStackPane(hbox);         // Add stack to HBox in top region

		border.setCenter(addGridPane());
		border.setRight(addFlowPane());
		
		//stackpane setup
		StackPane.setMargin(labelTitle, new Insets(10,10,10,10));
		StackPane.setAlignment(labelTitle, Pos.TOP_CENTER);
		StackPane.setAlignment(b1, Pos.TOP_CENTER);
		
		stackPane1.getChildren().add(labelTitle);
		stackPane1.getChildren().add(b1);
		
		//create scene
		Scene mainMenuScene = new Scene(stackPane1, 500, 500);
		
		//stage setup
		mainMenuStage.setTitle("Galaxy Explorer");
		mainMenuStage.setScene(mainMenuScene);
		mainMenuStage.show();
	}
	private Node addFlowPane() {
		// TODO Auto-generated method stub
		return null;
	}
	private Node addGridPane() {
		// TODO Auto-generated method stub
		return null;
	}
	public void addStackPane(HBox hb) {
	    StackPane stack = new StackPane();
	    Rectangle helpIcon = new Rectangle(30.0, 25.0);
	    helpIcon.setFill(new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE,
	        new Stop[]{
	        new Stop(0,Color.web("#4977A3")),
	        new Stop(0.5, Color.web("#B0C6DA")),
	        new Stop(1,Color.web("#9CB6CF")),}));
	    helpIcon.setStroke(Color.web("#D0E6FA"));
	    helpIcon.setArcHeight(3.5);
	    helpIcon.setArcWidth(3.5);

	    Text helpText = new Text("?");
	    helpText.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
	    helpText.setFill(Color.WHITE);
	    helpText.setStroke(Color.web("#7080A0")); 

	    stack.getChildren().addAll(helpIcon, helpText);
	    stack.setAlignment(Pos.CENTER_RIGHT);     // Right-justify nodes in stack
	    StackPane.setMargin(helpText, new Insets(0, 10, 0, 0)); // Center "?"

	    hb.getChildren().add(stack);            // Add to HBox from Example 1-2
	    HBox.setHgrow(stack, Priority.ALWAYS);    // Give stack any extra space
	}
	public VBox addVBox() {
		    VBox vbox = new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);

		    Text title = new Text("Data");
		    title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		    vbox.getChildren().add(title);
		return vbox;
	}

	public HBox addHBox() {
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);
	    hbox.setStyle("-fx-background-color: #336699;");

	    Button buttonCurrent = new Button("Current");
	    buttonCurrent.setPrefSize(100, 20);

	    Button buttonProjected = new Button("Projected");
	    buttonProjected.setPrefSize(100, 20);
	    hbox.getChildren().addAll(buttonCurrent, buttonProjected);

	    return hbox;
	}

		public static void main(String[] args)
		 {
		        launch(args);
		 }*/
		    
		
	}


