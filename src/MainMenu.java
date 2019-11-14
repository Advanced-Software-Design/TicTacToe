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
	private Button twoPlayerButton;
	
	@FXML
	private Button singlePlayerButton;

	@FXML
	private Button quitButton;


	@FXML
	void twoPlayerButton(ActionEvent event) throws IOException 
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Final.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene Final.fxml!");
		}
	}
	@FXML
	void singlePlayerButton(ActionEvent event) throws IOException 
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SinglePlayer.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene SinglePlayer.fxml!");
		}
	}

	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void initialize() {
		assert twoPlayerButton != null : "fx:id=\"twoPlayerButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
		assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert singlePlayerButton != null : "fx:id=\"singlePlayerButton\" was not injected: check your FXML file 'MainMenu.fxml'.";

	}
}
