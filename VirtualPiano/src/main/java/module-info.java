module com.example.virtualpiano{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.virtualpiano to javafx.fxml;
    opens com.example.virtualpiano.model to javafx.graphics;
    opens com.example.virtualpiano.view to javafx.graphics;
    opens com.example.virtualpiano.controller to javafx.controls;
    exports com.example.virtualpiano;
}