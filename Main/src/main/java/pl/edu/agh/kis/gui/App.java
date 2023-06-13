package pl.edu.agh.kis.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * Class that manages gui.
 */
public class App extends Application{
    //  Method that is called if a program need to run gui (This is determined by the program arguments given by end-user).

    public static Stage PrimaryStage;
    public static  Scene scene;

    public void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/pl/edu/agh/kis/gui/scene.fxml")));
//       Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene.fxml")));
        PrimaryStage=stage;
        PrimaryStage.setTitle("Bash to Powershell Translator");
        scene = new Scene(root, 1600,900, Color.WHITE);
        PrimaryStage.setScene(scene);
//        Image icon = new Image(Objects.requireNonNull(this.getClass().getResource("main/resources/btp.png")).toExternalForm());
        Image icon = new Image(Objects.requireNonNull(getClass().getResource("\\btp.png")).openStream());
        stage.getIcons().add(icon);


        stage.show();
    }


}
