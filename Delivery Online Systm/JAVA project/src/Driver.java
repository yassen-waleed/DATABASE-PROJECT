import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {
	public static void main(String[] arg0) {
		launch(arg0);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

    		primaryStage.setScene(Scenes_of_Admin.mainscene(primaryStage));
    		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}
