package iesfranciscodelosrios.LoginFX;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class adminController {
	@FXML Button oscuro;
	@FXML Button atras;
	@FXML Button ingles;
	@FXML AnchorPane panel;
	@FXML Label label;
	
	
	
	@FXML
	private void switchToLogin()throws IOException {
		App.setRoot("login");
	}
	
	
	@FXML
	private void switchToDarkMode(ActionEvent event) {
		Scene scene = ((Node) event.getSource()).getScene();
	    scene.getStylesheets().clear(); // Limpia cualquier hoja de estilo anterior
	    
	    scene.getStylesheets().add(getClass().getResource("/iesfranciscodelosrios/styles/oscuro.css").toExternalForm()); // Agrega la hoja de estilo de modo oscuro
	}
	
}
