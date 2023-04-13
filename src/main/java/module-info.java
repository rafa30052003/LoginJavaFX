module iesfranciscodelosrios.LoginFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens iesfranciscodelosrios.LoginFX to javafx.fxml;
    exports iesfranciscodelosrios.LoginFX;
}
