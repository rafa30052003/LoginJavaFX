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
	private String language = "en";
	
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
	        // carga el archivo de propiedades para el idioma por defecto (inglés)
		 

		 bundle = ResourceBundle.getBundle("traducciones.ingles", Locale.getDefault());
		 System.out.println(bundle.keySet());

	    }
	
	@FXML
    void onEnglishButtonClicked(ActionEvent event) {
        // cambia el idioma a inglés
        language = "en";
        bundle = ResourceBundle.getBundle("traducciones.ingles", Locale.getDefault());
        System.out.println(bundle.keySet());

        updateText();
    }

	
	
	  
	

	private void updateText() {
        // actualiza el texto de los botones y la etiqueta en función del idioma actual
        label.setText(bundle.getString("Administrator mode"));
        atras.setText(bundle.getString("back"));
        ingles.setText(bundle.getString("Translate to Spanish"));
        oscuro.setText(bundle.getString("Dark mode"));
    }
	
	
	
}
