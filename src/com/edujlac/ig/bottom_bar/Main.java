package com.edujlac.ig.bottom_bar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(new URL("file:src" + File.separator + "com" + File.separator + "edujlac"
                + File.separator + "ig" + File.separator + "bottom_bar" + File.separator + "bottomBar.fxml"));
        primaryStage.setTitle("Instagram BottomBar");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
