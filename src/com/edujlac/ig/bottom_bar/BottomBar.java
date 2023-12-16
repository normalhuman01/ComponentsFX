package com.edujlac.ig.bottom_bar;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BottomBar {

    @FXML
    BorderPane scene;

    @FXML
    ToggleButton darkMode;

    @FXML
    Text text;

    @FXML
    Hyperlink hyperlink;

    @FXML
    Button home;

    @FXML
    Button search;

    @FXML
    Button addPhoto;

    @FXML
    Button activity;

    @FXML
    Button profile;

    public static final String PATH_TO_CSS_LIGHT = "file:src" + File.separator + "com" + File.separator + "edujlac"
            + File.separator + "ig" + File.separator + "bottom_bar" + File.separator + "data"
            + File.separator + "style-light.css";

    public static final String PATH_TO_CSS_DARK = "file:src" + File.separator + "com" + File.separator + "edujlac"
            + File.separator + "ig" + File.separator + "bottom_bar" + File.separator + "data"
            + File.separator + "style-dark.css";

    public void initialize() {
        darkMode.setOnAction(actionEvent -> {
            if (darkMode.isSelected()) {
                scene.getStylesheets().set(0, PATH_TO_CSS_DARK);
            } else {
                scene.getStylesheets().set(0, PATH_TO_CSS_LIGHT);
            }
        });

        hyperlink.setGraphic(new ImageView(new Image("file:src" + File.separator + "com" + File.separator
                + "edujlac" + File.separator + "ig" + File.separator + "bottom_bar" + File.separator
                + "data" + File.separator + "img" + File.separator + "icons8-icons8-96.png")));

        hyperlink.setOnAction(actionEvent -> {
            try {
                Desktop.getDesktop().browse(new URI("https://icons8.com"));
            } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
            }
        });
    }

}
