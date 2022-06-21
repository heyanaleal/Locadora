package com.example.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import modal.ClienteDAO;
import modal.ClienteDTO;

public class clienteController {

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    void btnCadastrar() {
ClienteDTO cliente = new ClienteDTO();
		
    	
		cliente.setCpf(txtCpf.getText());
		cliente.setNome(txtNome.getText());  
		cliente.setEndereco(txtEndereco.getText());
		cliente.setTelefone(txtTelefone.getText());
		
	

		try {
			ClienteDAO dao = new ClienteDAO ();
			dao.cadastrar(cliente);
			exibiDialogoINFO("Cliente cadastrado com SUCESSO!");
			
			btnLimpar();

		} catch (Exception e) {
			// TODO: handle exception
			exibiDialogoERRO("ERRO! Falha ao cadastrar Cliente.");
			e.printStackTrace();
		}
    }

    @FXML
    void btnLimpar() {
		txtCpf.clear();
		txtEndereco.clear();
		txtNome.clear();
		txtTelefone.clear();
    }

	private void exibiDialogoINFO(String informacao) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText(null);
		alert.setContentText(informacao);

		alert.showAndWait();

	}

	void exibiDialogoERRO(String erro) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText(null);
		alert.setContentText(erro);

		alert.showAndWait();

	}

}
