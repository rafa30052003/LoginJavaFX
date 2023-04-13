module iesfranciscodelosrios.LoginFX {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;

    opens iesfranciscodelosrios.LoginFX to javafx.fxml;
    exports iesfranciscodelosrios.LoginFX;
}
