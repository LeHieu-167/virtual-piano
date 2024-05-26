package piano.Music_Notes;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import java.io.File;

public class Note {

    private String noteFilePiano;
    private String noteFileDrum;
    public MediaPlayer pianoMedia;
    MediaPlayer drumMedia;
    public Note(String pianoPath, String drumPath)
    {
        noteFilePiano =pianoPath;
        pianoMedia = new MediaPlayer(new Media(new File(noteFilePiano).toURI().toString()));
        noteFileDrum = drumPath;
        drumMedia = new MediaPlayer(new Media(new File(noteFileDrum).toURI().toString()));
    }
    //private String note1File = "src/main/java/piano/Music_Notes/B.wav";
    public void playNote(String type) {
        if(type=="Piano") {
            pianoMedia.stop();
            pianoMedia.play();
        }else{
            drumMedia.stop();
            drumMedia.play();
        }
    }

}
