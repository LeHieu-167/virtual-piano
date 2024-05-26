module piano {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens piano to javafx.fxml;
    exports piano;

}