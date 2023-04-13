package iesfranciscodelosrios.LoginFX;


import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class UserController{
	@FXML
	private Button button_OK;
	
	@FXML
	private void alertButton() throws IOException{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Datos Usuario");
		alert.setHeaderText("Se ha guardado correctamente.");
		alert.showAndWait();
	}
	@FXML
	private void alerta() throws IOException{
		alertButton();
	}
}
