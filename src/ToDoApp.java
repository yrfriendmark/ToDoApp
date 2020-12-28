import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ToDoApp extends Application {

    @Override
    public void init() throws Exception {
        // Initialization, code that runs before the start i.e., loading
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent mainScreenRoot = FXMLLoader.load(getClass().getResource("mainscreen.fxml"));
        Scene mainScreen = new Scene(mainScreenRoot);
        primaryStage.setTitle("To Do");
        primaryStage.setScene(mainScreen);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        // Code the runs after the application is stopped
    }
}
