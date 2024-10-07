package org.fxmedia.mediafx;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javax.print.attribute.standard.Media;
import java.awt.*;

public class MediaController {
    private Stage stage;
    private Scene scene;
    private BorderPane borderPane;
    private HBox hBox;

    private Media media;
    private MediaPlayer mediaPlayer;
    private MediaView mediaView;

    private String MediaUrl = "";

    private Button btnPlay;
    private Button btnPause;


    public MediaController(){
        initializer();
    }

    private void initializer(){
        stage = new Stage();
        stage.setTitle("Java media Player");
        borderPane = new BorderPane();


    }
}
