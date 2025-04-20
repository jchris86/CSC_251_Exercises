//CSC-251-James Christenbury-Chapter 15-Exercise #2
//Date: 9-12-2020
/*This program utilizes javafx to create a GUI that instantiates a 
  button object that asks the user to click on it. An if statement is
  used to cap the amount of clicks allowed. When the counter reaches 8
  clicks the button is disabled and can no longer be clicked.
*/

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXFrameDisableButton2b extends Application
{
	@Override
	public void start(Stage stage)
	{

		Button bt = new Button();
		bt.setText("Click this button");
		bt.setOnAction(new EventHandler<ActionEvent>()
		
		{
			int count = 0;
			@Override
			public void handle(ActionEvent event)
				{
				count++;

				if(count == 8)
					
					bt.setDisable(true);			
				}
				
		});

		StackPane root = new StackPane();
		root.getChildren().add(bt);
		stage.setTitle("Disable Button");
		stage.setScene(new Scene(root));
		stage.setHeight(500);
		stage.setWidth(400);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}	  
		