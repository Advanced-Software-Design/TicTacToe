import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MainMenu {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button playButton;

	@FXML
	private Button quitButton;


	@FXML
	void playButton(ActionEvent event) throws IOException 
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Final.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Class MainMenu!");
		}
	}

	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void initialize() {
		assert playButton != null : "fx:id=\"playButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
		assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'MainMenu.fxml'.";

	}
}
