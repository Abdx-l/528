package Bookstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GUIfxml.fxml"));
            Parent root = loader.load();

            // Create a scene with the loaded FXML root
            Scene scene = new Scene(root);

            // Set the title of the window
            primaryStage.setTitle("Bookstore GUI");

            // Set the scene to the stage
            primaryStage.setScene(scene);

            // Show the window
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
