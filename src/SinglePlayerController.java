import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class SinglePlayerController {

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
		button1.setDisable(true);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		
		findDraw();
		findWinner();
	}
	@FXML
	void buttonX2Press(ActionEvent event) {
		textField2.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(true);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX3Press(ActionEvent event) {
		textField3.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(true);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX4Press(ActionEvent event) {
		textField4.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(true);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX5Press(ActionEvent event) {
		textField5.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(true);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX6Press(ActionEvent event) {
		textField6.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(true);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX7Press(ActionEvent event) {
		textField7.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(true);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX8Press(ActionEvent event) {
		textField8.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(true);
		button16.setDisable(true);
		button17.setDisable(false);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonX9Press(ActionEvent event) {
		textField9.setText("X");
		button1.setDisable(false);
		button2.setDisable(true);
		button3.setDisable(false);
		button4.setDisable(true);
		button5.setDisable(false);
		button6.setDisable(true);
		button7.setDisable(false);
		button8.setDisable(true);
		button9.setDisable(false);
		button10.setDisable(true);
		button11.setDisable(false);
		button12.setDisable(true);
		button13.setDisable(false);
		button14.setDisable(true);
		button15.setDisable(false);
		button16.setDisable(true);
		button17.setDisable(true);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO1Press(ActionEvent event) {
		textField1.setText("O");
		button1.setDisable(true);
		button2.setDisable(true);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO2Press(ActionEvent event) {
		textField2.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(true);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO3Press(ActionEvent event) {
		textField3.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(true);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO4Press(ActionEvent event) {
		textField4.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(true);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO5Press(ActionEvent event) {
		textField5.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(true);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO6Press(ActionEvent event) {
		textField6.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(true);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO7Press(ActionEvent event) {
		textField7.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(true);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO8Press(ActionEvent event) {
		textField8.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(true);
		button17.setDisable(true);
		button18.setDisable(false);

		findDraw();
		findWinner();
	}
	@FXML
	void buttonO9Press(ActionEvent event) {
		textField9.setText("O");
		button1.setDisable(true);
		button2.setDisable(false);
		button3.setDisable(true);
		button4.setDisable(false);
		button5.setDisable(true);
		button6.setDisable(false);
		button7.setDisable(true);
		button8.setDisable(false);
		button9.setDisable(true);
		button10.setDisable(false);
		button11.setDisable(true);
		button12.setDisable(false);
		button13.setDisable(true);
		button14.setDisable(false);
		button15.setDisable(true);
		button16.setDisable(false);
		button17.setDisable(true);
		button18.setDisable(true);

		findDraw();
		findWinner();
	}
	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}
	@FXML
	void buttonQuitWinner(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void buttonRestart(ActionEvent event) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SinglePlayer.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Reloading TicTacToe Board!");
		}
	}
	public void findDraw() {
		if ((textField1.getText().equals("X") || textField1.getText().equals("O")) && 
				(textField2.getText().equals("X") || textField2.getText().equals("O")) &&
				(textField3.getText().equals("X") || textField3.getText().equals("O")) &&
				(textField4.getText().equals("X") || textField4.getText().equals("O")) &&
				(textField5.getText().equals("X") || textField5.getText().equals("O")) &&
				(textField6.getText().equals("X") || textField6.getText().equals("O")) &&
				(textField7.getText().equals("X") || textField7.getText().equals("O")) &&
				(textField8.getText().equals("X") || textField8.getText().equals("O")) &&
				(textField9.getText().equals("X") || textField9.getText().equals("O"))){
			DrawSlide();
		}
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
	public void DrawSlide() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Draw2.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene Draw2!");
		}	
	}
	public void WinnerSlide(){
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Winner2.fxml"));
			Parent gameScene = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(gameScene));  
			stage.show();

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene Winner2!");
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
