package iesfranciscodelosrios.LoginFX;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

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
	private ResourceBundle bundle;
	
	
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
	
	


	
	
	  
	public void initialize() {
        // Inicializar el objeto bundle con el archivo de propiedades correspondiente
        bundle = ResourceBundle.getBundle("com.example.MyBundle");
    }

    @FXML
    public void cambiarIdioma(ActionEvent event) {
        // Utilizar el objeto bundle para obtener los textos correspondientes al idioma seleccionado
        String textoLabel = bundle.getString("label.text");
        String textoVolver = bundle.getString("buttonVolver.text");
        String textoOscuro = bundle.getString("buttonOscuro.text");
        String textoTraducir = bundle.getString("buttonTraducir.text");
        label.setText(textoLabel);
        atras.setText(textoVolver);
        oscuro.setText(textoOscuro);
        ingles.setText(textoTraducir);
    }
	
	
	
}
