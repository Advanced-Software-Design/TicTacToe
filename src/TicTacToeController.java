import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeController {

	@FXML
	GridPane gameBoard;

	@FXML
	private TextField textField1;

	@FXML
	private TextField textField2;

	@FXML
	private TextField textField3;

	@FXML
	private TextField textField4;

	@FXML
	private TextField textField5;

	@FXML
	private TextField textField6;

	@FXML
	private TextField textField7;

	@FXML
	private TextField textField8;

	@FXML
	private TextField textField9;

	@FXML
	private Button quitButton;

	@FXML
	private Button button1;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Button button4;

	@FXML
	private Button button5;

	@FXML
	private Button button6;

	@FXML
	private Button button7;

	@FXML
	private Button button8;

	@FXML
	private Button button9;

	@FXML
	private Button button10;

	@FXML
	private Button button11;

	@FXML
	private Button button12;

	@FXML
	private Button button13;

	@FXML
	private Button button14;

	@FXML
	private Button button15;

	@FXML
	private Button button16;

	@FXML
	private Button button17;

	@FXML
	private Button button18;
	
	@FXML
	void buttonX1Press(ActionEvent event) {
		textField1.setText("X");
		findWinner();
	}
	@FXML
	void buttonX2Press(ActionEvent event) {
		textField2.setText("X");
		findWinner();
	}
	@FXML
	void buttonX3Press(ActionEvent event) {
		textField3.setText("X");
		findWinner();
	}
	@FXML
	void buttonX4Press(ActionEvent event) {
		textField4.setText("X");
		findWinner();
	}
	@FXML
	void buttonX5Press(ActionEvent event) {
		textField5.setText("X");
		findWinner();
	}
	@FXML
	void buttonX6Press(ActionEvent event) {
		textField6.setText("X");
		findWinner();
	}
	@FXML
	void buttonX7Press(ActionEvent event) {
		textField7.setText("X");
		findWinner();
	}
	@FXML
	void buttonX8Press(ActionEvent event) {
		textField8.setText("X");

	}
	@FXML
	void buttonX9Press(ActionEvent event) {
		textField9.setText("X");
		findWinner();
	}
	@FXML
	void buttonO1Press(ActionEvent event) {
		textField1.setText("O");
		findWinner();
	}
	@FXML
	void buttonO2Press(ActionEvent event) {
		textField2.setText("O");
		findWinner();
	}
	@FXML
	void buttonO3Press(ActionEvent event) {
		textField3.setText("O");
		findWinner();
	}
	@FXML
	void buttonO4Press(ActionEvent event) {
		textField4.setText("O");
		findWinner();
	}
	@FXML
	void buttonO5Press(ActionEvent event) {
		textField5.setText("O");
		findWinner();
	}
	@FXML
	void buttonO6Press(ActionEvent event) {
		textField6.setText("O");
		findWinner();
	}
	@FXML
	void buttonO7Press(ActionEvent event) {
		textField7.setText("O");
		findWinner();
	}
	@FXML
	void buttonO8Press(ActionEvent event) {
		textField8.setText("O");
		findWinner();
	}
	@FXML
	void buttonO9Press(ActionEvent event) {
		textField9.setText("O");
		findWinner();
	}
	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}
	public void findWinner(){
		
		//Row 1
		if (textField1.getText().equals(textField2.getText()) 
			&&	(textField2.getText().equals( textField3.getText()))){
			System.out.println("Winner Test 1");
			WinnerSlide();
		}
		//Row 2
		if (textField4.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField6.getText())){
			System.out.println("Winner Test 2");

			WinnerSlide();
		}
		//Row 3
		if (textField7.getText().equals(textField8.getText())
				&& textField8.getText().equals(textField9.getText())){
			System.out.println("Winner Test 3");

			WinnerSlide();
		}
		//Column 1
		if (textField1.getText().equals(textField4.getText()) 
				&& textField4.getText().equals(textField7.getText())){
			System.out.println("Winner Test 4");

			WinnerSlide();
		}
		//Column 2
		if (textField2.getText().equals(textField5.getText())
				&& textField5.getText().equals(textField8.getText())){
			System.out.println("Winner Test 5");

			WinnerSlide();
		}
		//Column 3
		if (textField3.getText().equals(textField6.getText()) 
				&& textField6.getText().equals(textField9.getText())){
			System.out.println("Winner Test 6");

			WinnerSlide();
		}
		//Diagonal 1
		if (textField1.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField9.getText())){
			System.out.println("Winner Test 7");

			WinnerSlide();
		}
		//Diagonal 2
		if (textField3.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField7.getText())){
			System.out.println("Winner Test 8");

			WinnerSlide();

		}

	}
	public void WinnerSlide(){
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Winner.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Class WinnerPage!");
		}		
	}
	@FXML
	void initialize() {
		assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'Final.fxml'.";
		assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'Final.fxml'.";
		assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'Final.fxml'.";
		assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'Final.fxml'.";
		assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'Final.fxml'.";
		assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'Final.fxml'.";
		assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file 'Final.fxml'.";
		assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file 'Final.fxml'.";
		assert button9 != null : "fx:id=\"button9\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField2 != null : "fx:id=\"textField2\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField3 != null : "fx:id=\"textField3\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField4 != null : "fx:id=\"textField4\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField5 != null : "fx:id=\"textField5\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField6 != null : "fx:id=\"textField6\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField7 != null : "fx:id=\"textField7\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField8 != null : "fx:id=\"textField8\" was not injected: check your FXML file 'Final.fxml'.";
		assert textField9 != null : "fx:id=\"textField9\" was not injected: check your FXML file 'Final.fxml'.";

	}
}
