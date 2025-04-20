import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ButtonClick extends Application {
   public static void main(String[] args) { //main method
       Application.launch(args);
   }

   @Override
   public void start(Stage primaryStage) {

       Button btn = new Button(); //button
       Label label1 = new Label("This is first sentence."); //lable1
       Label label2 = new Label(); //label2

       primaryStage.setTitle("Button click"); //set the title window

       //set the position of the lable1,label2,button
       label1.setLayoutX(30);
       label1.setLayoutY(70);
       label2.setLayoutX(30);
       label2.setLayoutY(90);

       btn.setLayoutX(30); //button position in x
       btn.setLayoutY(30); //button position in y
       btn.setText("Click"); //set the label button

       btn.setOnAction(new EventHandler<ActionEvent>() { //button event
           @Override
           public void handle(ActionEvent event) {
               label2.setText("This is second sentence."); //set the label text on button click
           }
       });

       Group root = new Group();

       root.getChildren().add(btn);
       root.getChildren().add(label1);
       root.getChildren().add(label2);
       primaryStage.setScene(new Scene(root, 200, 200)); //window size
       primaryStage.show();
   }
}

