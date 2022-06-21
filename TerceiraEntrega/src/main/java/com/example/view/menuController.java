package com.example.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class menuController {

    @FXML
    private Menu MenuCadastro;

    public void initialize(URL argO, ResourceBundle arg1) {
    	
 
    }


    @FXML
    void CadastroCarro(ActionEvent event) {
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("Carro.fxml"));
		Scene scene = null;
		try {
			scene = new Scene(fxmlLoader.load(), 600, 400);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Stage stage = new Stage();
		stage.setTitle("Locadora - Cadastro Carro");
		stage.setResizable(false);
		stage.setScene(scene);
        stage.getIcons().add(new Image("https://raw.githubusercontent.com/heyanaleal/Locadora/main/Imagem/carro.png"));

		stage.show();
    }

    @FXML
    void CadastroCliente(ActionEvent event) {
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("Cliente.fxml"));
		Scene scene = null;
		try {
			scene = new Scene(fxmlLoader.load(), 600, 400);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Stage stage = new Stage();
		stage.setTitle("Locadora - Cadastro Cliente");
		stage.setResizable(false);
		stage.setScene(scene);
        stage.getIcons().add(new Image("https://raw.githubusercontent.com/heyanaleal/Locadora/main/Imagem/carro.png"));

		stage.show();
    }

    @FXML
    void CadastroFuncionario(ActionEvent event) {
    	FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("Funcionario.fxml"));
		Scene scene = null;
		try {
			scene = new Scene(fxmlLoader.load(), 600, 400);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Stage stage = new Stage();
		stage.setTitle("Locadora - Cadastro Funcionario");
		stage.setResizable(false);
		stage.setScene(scene);
        stage.getIcons().add(new Image("https://raw.githubusercontent.com/heyanaleal/Locadora/main/Imagem/carro.png"));

		stage.show();
    }

}
