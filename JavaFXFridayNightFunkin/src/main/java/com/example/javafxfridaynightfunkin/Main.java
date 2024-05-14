package com.example.javafxfridaynightfunkin;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {
    private static Stage stage;

    public static Stage getStage(){
        return stage;
    }

    @Override
    public void start(Stage stage) {
        Main.stage = stage;
        stage.setTitle("JavaFX Friday Night Funkin");
        stage.setWidth(1280d);
        stage.setHeight(720d);
        stage.setResizable(false);
        stage.show();
        stage.setScene(MainMenu.getCreatedScene(0));
    }

    public static void main(String[] args) {
        launch();
    }
}