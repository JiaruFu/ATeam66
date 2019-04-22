package application;


import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public final class Main extends Application {


  @Override
  public void start(Stage stage) {
    stage.setTitle("Quiz Generator");
    FileChooser fileChooser = new FileChooser();
    Button openButton = new Button("Load Question");
    GridPane inputGridPane = new GridPane();

    GridPane.setConstraints(openButton, 0, 0);
    inputGridPane.getChildren().addAll(openButton);

    Pane rootGroup = new VBox(12);
    rootGroup.getChildren().addAll(inputGridPane);
    rootGroup.setPadding(new Insets(12, 12, 12, 12));

    openButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
         // directly retrieve data from json file and update corresponding information
          
        }
      }
    });

    stage.setScene(new Scene(rootGroup, 500, 500));
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }

 
}
