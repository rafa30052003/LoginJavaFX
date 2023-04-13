package iesfranciscodelosrios.LoginFX;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	/*
	 * Agrego un usuario a mano para probar las vistas Al final se accede con los
	 * usuarios que estén registrados en la base de datos
	 */
	@FXML
	private TextField NombreUsu;

	@FXML
	private PasswordField ContraUsuario;

	@FXML
	public void botonAcceso() throws IOException {
		checkLogin();
	}

	/*
	 * Verifica que los datos introducidos son esos
	 */
	private void checkLogin() throws IOException {
		App a = new App();
		if (NombreUsu.getText().toString().equals("Admin") && ContraUsuario.getText().toString().equals("Admin")) {

			App.setRoot("admin");

		} else if (NombreUsu.getText().toString().equals("Usuario") && ContraUsuario.getText().toString().equals("Usuario")) {

			App.setRoot("usuario");
		
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error de inicio de sesión");
			alert.setHeaderText("Introduce el usuario y la contraseña correctamente");
			alert.showAndWait();
		}
	}
}

