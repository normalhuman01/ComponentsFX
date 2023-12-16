module ComponentsFX {
    requires java.desktop;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    opens com.edujlac.ig.bottom_bar to javafx.controls, javafx.graphics, javafx.fxml, java.desktop;
}