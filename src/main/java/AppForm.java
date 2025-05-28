import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene=new Scene(FXMLLoader.load(getClass().getResource("/ProductForm.fxml")));
        primaryStage.setTitle("AppForm");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
