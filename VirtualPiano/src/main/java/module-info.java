module com.example.virtualpiano{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.virtualpiano to javafx.fxml;
    exports com.example.virtualpiano;
}