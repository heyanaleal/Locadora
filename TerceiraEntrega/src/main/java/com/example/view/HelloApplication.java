package com.example.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load(), 597, 398);
        stage.setTitle("Locadora");
        stage.setScene(scene);
        stage.getIcons().add(new Image("https://raw.githubusercontent.com/heyanaleal/Locadora/main/Imagem/carro.png"));
        stage.setResizable(false);
        
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}