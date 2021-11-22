package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			int b;
		} catch(Exception e) {
			//sadasdas
			
			//ASDHASUDHASDUHASDUh
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//HelloD
		//Test
		///SSDJSIJADIDJSJDIAJSDIDJASIASJDIJI
<<<<<<< HEAD
		
		
=======
		/// saluuuuuuut
>>>>>>> 31d80b6cc44d882af2547a7c6f453a2cff247b42
	}
}
