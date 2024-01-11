package com.example.virtualpiano.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.Node;

public class Piano extends Application {
    private HBox root;
    @Override
    public void start(Stage primaryStage) {
        root = new HBox();
        Scene scene = new Scene(root, 400, 150);

        // Tạo và thêm các phím đàn vào giao diện
        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
        for (String note : notes) {
            Key key = new Key(note);
            root.getChildren().add(key);
        }

        primaryStage.setTitle("Virtual Piano");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Node> getKeys() {
        return root.getChildren();
    }
}