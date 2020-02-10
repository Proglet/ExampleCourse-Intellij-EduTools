import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MyApplication extends Application {


    public static void main(String[] args) {
        Application.launch(MyApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(new Scene(new Label("Hello World!"), 800, 60));
        primaryStage.setTitle("My Application");
        primaryStage.show();
    }
}