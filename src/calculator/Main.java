package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage frame) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("framefx.fxml"));
        frame.setTitle("Калькулятор");
        frame.setScene(new Scene(root));
        frame.setResizable(false);
        frame.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
