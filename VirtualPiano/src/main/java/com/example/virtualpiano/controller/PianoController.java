package com.example.virtualpiano.controller;

import com.example.virtualpiano.model.Key;
import com.example.virtualpiano.model.Piano;
import javafx.scene.control.Slider;
import java.util.ArrayList;

public class PianoController {
    private Piano piano;
    private Slider volumeSlider;
    private ArrayList<String> recordedNotes;
    private boolean isRecording;

    public PianoController(Piano piano, Slider volumeSlider) {
        this.piano = piano;
        this.volumeSlider = volumeSlider;
        recordedNotes = new ArrayList<>();
        isRecording = false;
        setupVolumeControl();
        setupKeys();
    }

    private void setupVolumeControl() {
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            piano.getKeys().forEach(node -> {
                if (node instanceof Key key) {
                    key.getMediaPlayer().setVolume(newValue.doubleValue());
                }
            });
        });
    }


    private void setupKeys() {
        piano.getKeys().forEach(node -> {
            if (node instanceof Key key) {
                key.setOnMousePressed(event -> {
                    key.getMediaPlayer().play();
                    if (isRecording) recordedNotes.add(key.getNote());
                });
                key.setOnMouseReleased(event -> key.getMediaPlayer().stop());
            }
        });
    }

    public void startRecording() {
        recordedNotes.clear();
        isRecording = true;
    }

    public void stopRecording() {
        isRecording = false;
        // Xử lý ghi âm ở đây, ví dụ in ra console
        System.out.println("Recorded notes: " + String.join(", ", recordedNotes));
    }

    public boolean isRecording() {
        return isRecording;
    }
}
