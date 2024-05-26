package piano;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import piano.Music_Notes.Note;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;


import java.io.File;

public class Piano {

    @FXML
    private Button btnnoteC;
    @FXML
    private Button btnnoteCs;
    @FXML
    private Button btnnoteD;
    @FXML
    private Button btnnoteE;
    @FXML
    private Button btnnoteF;
    @FXML
    private Button btnnoteDs;
    @FXML
    private Button btnnoteFs;
    @FXML
    private Button btnnoteG;
    @FXML
    private Button btnnoteA;
    @FXML
    private Button btnnoteB;
    @FXML
    private Button btnnoteGs;
    @FXML
    private Button btnnoteBb;
    @FXML
    private Button btnnoteC1;
    @FXML
    private Button btnnoteD1;
    @FXML
    private Button btnnoteE1;
    @FXML
    private Button btnnoteF1;
    @FXML
    private Button btnnoteCs1;
    @FXML
    private Button btnnoteDs1;
    @FXML
    private Button btnVlmUp;
    @FXML
    private Button btnvlmdown;
    @FXML
    private Button btnexit;




    Note noteC;
    Note noteD;
    Note noteCs;
    Note noteE;
    Note noteF;
    Note noteDs;
    Note noteFs;
    Note noteG;
    Note noteA;
    Note noteB;
    Note noteGs;
    Note noteBb;
    Note noteC1;
    Note noteD1;
    Note noteE1;
    Note noteF1;
    Note noteCs1;
    Note noteDs1;



    private String noteCFile = "src/main/java/piano/Music_Notes/C.wav";
    private String dnoteCFile = "src/main/java/piano/Music_Notes/Steel_Drum/C_Drum.wav";
    private String noteDFile = "src/main/java/piano/Music_Notes/D.wav";
    private String dnoteDFile = "src/main/java/piano/Music_Notes/Steel_Drum/D_Drum.wav";
    private String noteCsFile = "src/main/java/piano/Music_Notes/C_s.wav";
    private String dnoteCqFile = "src/main/java/piano/Music_Notes/Steel_Drum/Cq_Drum.wav";
    private String noteEFile = "src/main/java/piano/Music_Notes/E.wav";
    private String dnoteEFile = "src/main/java/piano/Music_Notes/Steel_Drum/E_Drum.wav";
    private String noteFFile = "src/main/java/piano/Music_Notes/F.wav";
    private String dnoteFFile = "src/main/java/piano/Music_Notes/Steel_Drum/F_Drum.wav";
    private String noteDsFile = "src/main/java/piano/Music_Notes/D_s.wav";
    private String dnoteDqFile = "src/main/java/piano/Music_Notes/Steel_Drum/Dq_Drum.wav";
    private String noteFsFile = "src/main/java/piano/Music_Notes/F_s.wav";
    private String dnoteFqFile = "src/main/java/piano/Music_Notes/Steel_Drum/Fq_Drum.wav";
    private String noteGFile = "src/main/java/piano/Music_Notes/G.wav";
    private String dnoteGFile = "src/main/java/piano/Music_Notes/Steel_Drum/G_Drum.wav";
    private String noteAFile = "src/main/java/piano/Music_Notes/A.wav";
    private String dnoteAFile = "src/main/java/piano/Music_Notes/Steel_Drum/A_Drum.wav";
    private String noteBFile = "src/main/java/piano/Music_Notes/B.wav";
    private String dnoteBFile = "src/main/java/piano/Music_Notes/Steel_Drum/B_Drum.wav";
    private String noteGsFile = "src/main/java/piano/Music_Notes/G_s.wav";
    private String dnoteGqFile = "src/main/java/piano/Music_Notes/Steel_Drum/Gq_Drum.wav";
    private String noteBbFile = "src/main/java/piano/Music_Notes/Bb.wav";
    private String dnoteBbFile = "src/main/java/piano/Music_Notes/Steel_Drum/Bb_Drum.wav";
    private String noteC1File = "src/main/java/piano/Music_Notes/C1.wav";
    private String dnoteC1File = "src/main/java/piano/Music_Notes/Steel_Drum/C1_Drum.wav";
    private String noteD1File = "src/main/java/piano/Music_Notes/D1.wav";
    private String dnoteD1File = "src/main/java/piano/Music_Notes/Steel_Drum/D1_Drum.wav";
    private String noteE1File = "src/main/java/piano/Music_Notes/E1.wav";
    private String dnoteE1File = "src/main/java/piano/Music_Notes/Steel_Drum/E1_Drum.wav";
    private String noteF1File = "src/main/java/piano/Music_Notes/F1.wav";
    private String dnoteF1File = "src/main/java/piano/Music_Notes/Steel_Drum/F1_Drum.wav";
    private String noteCs1File = "src/main/java/piano/Music_Notes/C_s1.wav";
    private String dnoteCq1File = "src/main/java/piano/Music_Notes/Steel_Drum/Cq1_Drum.wav";
    private String noteDs1File = "src/main/java/piano/Music_Notes/D_s1.wav";
    private String dnoteDq1File = "src/main/java/piano/Music_Notes/Steel_Drum/Dq1_Drum.wav";

    private String type = "Piano";

    private List<MediaPlayer> allMediaPlayers = new ArrayList<>();

    @FXML void initialize() {
        noteC = new Note(noteCFile, dnoteCFile);
        noteD = new Note(noteDFile, dnoteDFile);
        noteCs = new Note(noteCsFile, dnoteCqFile);
        noteE = new Note(noteEFile, dnoteEFile);
        noteF = new Note(noteFFile, dnoteFFile);
        noteDs= new Note(noteDsFile, dnoteDqFile);
        noteFs= new Note(noteFsFile, dnoteFqFile);
        noteG= new Note(noteGFile, dnoteGFile);
        noteA= new Note(noteAFile, dnoteAFile);
        noteB= new Note(noteBFile, dnoteBFile);
        noteGs= new Note(noteGsFile, dnoteGqFile);
        noteBb= new Note(noteBbFile, dnoteBbFile);
        noteC1= new Note(noteC1File, dnoteC1File);
        noteD1= new Note(noteD1File, dnoteD1File);
        noteE1= new Note(noteE1File, dnoteE1File);
        noteF1= new Note(noteF1File, dnoteF1File);
        noteCs1 = new Note(noteCs1File, dnoteCq1File);
        noteDs1 = new Note(noteDs1File, dnoteDq1File);

        allMediaPlayers.add(noteC.pianoMedia);
        allMediaPlayers.add(noteD.pianoMedia);
        allMediaPlayers.add(noteCs.pianoMedia);
        allMediaPlayers.add(noteE.pianoMedia);
        allMediaPlayers.add(noteF.pianoMedia);
        allMediaPlayers.add(noteDs.pianoMedia);
        allMediaPlayers.add(noteFs.pianoMedia);
        allMediaPlayers.add(noteG.pianoMedia);
        allMediaPlayers.add(noteA.pianoMedia);
        allMediaPlayers.add(noteB.pianoMedia);
        allMediaPlayers.add(noteGs.pianoMedia);
        allMediaPlayers.add(noteBb.pianoMedia);
        allMediaPlayers.add(noteC1.pianoMedia);
        allMediaPlayers.add(noteD1.pianoMedia);
        allMediaPlayers.add(noteE1.pianoMedia);
        allMediaPlayers.add(noteF1.pianoMedia);
        allMediaPlayers.add(noteCs1.pianoMedia);
        allMediaPlayers.add(noteDs1.pianoMedia);


    }
    @FXML
    private void Vlup(ActionEvent event) {
        for (MediaPlayer mediaPlayer : allMediaPlayers) {
            mediaPlayer.setVolume(mediaPlayer.getVolume() + 0.1);
            System.out.println("vlm +");
        }
    }

    @FXML
    private void Vldown(ActionEvent event) {
        for (MediaPlayer mediaPlayer : allMediaPlayers) {
            mediaPlayer.setVolume(mediaPlayer.getVolume() - 0.1);
            System.out.println("vlm -");
        }
    }

     //allMediaPlayers.add(mediaPlayer2);

    @FXML
    public void exit(ActionEvent event)
    {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        //alert.setHeaderText("exit ?");
        alert.setContentText("ARE YOU WANT TO QUIT ?");
        if(alert.showAndWait().get()==ButtonType.OK)
        {
            // quit
            Stage stage = (Stage) btnexit.getScene().getWindow();
            stage.close();
        }
    }
    @FXML
    void changeType(ActionEvent event) {
        if (type=="Piano"){
            System.out.println("Change to drum");
            type = "Drum";
        }else{
            System.out.println("Change to piano");
            type = "Piano";
        }
    }
    @FXML
    private void dosthC(){
        noteC.playNote(type);
    }
    @FXML
    private void dosthD(){
        noteD.playNote(type);
    }
    @FXML
    private void dosthCs() {
        noteCs.playNote(type);
    }
    @FXML
    private void dosthE() {
        noteE.playNote(type);
    }
    @FXML
    private void dosthF() {
        noteF.playNote(type);
    }
    @FXML
    private void dosthDs() {
        noteDs.playNote(type);
    }
    @FXML
    private void dosthFs() {
        noteFs.playNote(type);
    }
    @FXML
    private void dosthG() {
        noteG.playNote(type);
    }
    @FXML
    private void dosthA() {
        noteA.playNote(type);
    }
    @FXML
    private void dosthB() {
        noteB.playNote(type);
    }
    @FXML
    private void dosthGs() {
        noteGs.playNote(type);
    }
    @FXML
    private void dosthBb() {
        noteBb.playNote(type);
    }
    @FXML
    private void dosthC1() {
        noteC1.playNote(type);
    }
    @FXML
    private void dosthD1() {
        noteD1.playNote(type);
    }
    @FXML
    private void dosthE1() {
        noteE1.playNote(type);
    }
    @FXML
    private void dosthF1() {
        noteF1.playNote(type);
    }
    @FXML
    private void dosthCs1() {
        noteCs1.playNote(type);
    }
    @FXML
    private void dosthDs1() {
        noteDs1.playNote(type);
    }



}
