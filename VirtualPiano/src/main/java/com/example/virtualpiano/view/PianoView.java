package com.example.virtualpiano.view;

import com.example.virtualpiano.controller.PianoController;
import com.example.virtualpiano.model.Piano;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PianoView extends Application {
    private PianoController controller;
    private Button recordButton;

    @Override
    public void start(Stage stage) {
        Piano piano = new Piano();
        Slider volumeSlider;
        controller = getController(piano);

        volumeSlider = new Slider(0, 1, 0.5);
        recordButton = new Button("Record");
        recordButton.setOnAction(event -> {
            if (controller.isRecording()) {
                controller.stopRecording();
                recordButton.setText("Record");
            } else {
                controller.startRecording();
                recordButton.setText("Stop");
            }
        });

        HBox pianoLayout = new HBox();
        piano.getKeys().forEach(key -> pianoLayout.getChildren().add(key));

        VBox root = new VBox(10, volumeSlider, recordButton, pianoLayout);
        Scene scene = new Scene(root, 400, 150);

        stage.setTitle("Virtual Piano");
        stage.setScene(scene);
        stage.show();
    }

    private static PianoController getController(Piano piano) {
        return new PianoController(piano, null);
    }
}
