package frontendmalak;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    public static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        // Load the initial scene
        changeScene("/frontendmalak/View/helloView.fxml"); // Load the first FXML file
        // You can call changeScene again to load another FXML file if needed
        // changeScene("/frontendmalak/View/anotherView.fxml");

        stage.show();
    }

    public static void changeScene(String fxmlPath) throws IOException {

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxmlPath));
            BorderPane newRoot = new BorderPane();
            loader.setRoot(newRoot);


                Parent loadedContent = loader.load();
                Scene scene = new Scene(loadedContent);

                stg.setScene(scene);

        }


    public static void main(String[] args) {
        launch(args);
    }
}