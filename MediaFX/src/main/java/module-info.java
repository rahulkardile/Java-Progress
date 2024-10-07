module org.fxmedia.mediafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;

    opens org.fxmedia.mediafx to javafx.fxml;
    exports org.fxmedia.mediafx;
}