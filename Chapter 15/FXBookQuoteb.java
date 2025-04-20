//CSC-251-Advanced Java-James Christenbury-Chapter 15-Exercise #1
//Date: 9-6-2020
/*This program uses the javafx tool to display a book quote made from
  a label object. A button object is also created that reveals the title
  of the book the quote is taken from. Various fxclasses are imported to create
  and modify the display The program ends when the window is
  closed.*/


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXBookQuoteb extends Application 
{

	@Override
	public void start(Stage primaryStage)
	{
		
		Button bt = new Button();
		bt.setText("Show Book Title");
		bt.setLayoutX(50);
		bt.setLayoutY(50);
	
		Label lb = new Label(" Whether I shall turn out to be the hero of my life,\n or whether that station will be held by anybody else,\n these pages must show.");
		Label lb2 = new Label();
		lb.setPrefWidth(750);
		lb.setPrefHeight(300);
		lb.setWrapText(true);
		lb.setTextFill(Color.BLUE);
		lb.setFont(Font.font("Cambrian", 20));
		lb2.setFont(Font.font("Aria", 20));
		lb2.setTextFill(Color.RED);

		Group root = new Group();
		root.getChildren().add(lb);
		root.getChildren().add(lb2);
		root.getChildren().add(bt);
		
		bt.setOnAction(new EventHandler<ActionEvent>()
		{

		@Override
		public void handle(ActionEvent event)
			{
			 lb2.setText("David Copperfield");
			}
		});

		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setTitle("Book Quote");
		primaryStage.setWidth(650);
		primaryStage.setHeight(300);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
	