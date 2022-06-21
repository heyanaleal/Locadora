package com.example.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import modal.FuncionarioDAO;
import modal.FuncionarioDTO;

public class funcionarioController {

	@FXML
    private TextField txtCargo;

    @FXML
    private TextField txtCargoAtt;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtCpfAtt;

    @FXML
    private TextField txtNomeFuncionario;

    @FXML
    private TextField txtNomeFuncionarioAtt;

    @FXML
    private TextField txtSalario;


    @FXML
    void btnCadastrar() {
  
			FuncionarioDTO funcio = new FuncionarioDTO();
			
			funcio.setNome(txtNomeFuncionario.getText());
			funcio.setCpf(txtCpf.getText());
			funcio.setCargo(txtCargo.getText());
			funcio.setSalario(txtSalario.getText());
	
			try {
				FuncionarioDAO dao = new FuncionarioDAO ();
				dao.cadastrar(funcio);
				exibiDialogoINFO("Cliente cadastrado com SUCESSO!");
				
				btnLimpar();
			
	
			} catch (Exception e) {
				// TODO: handle exception
				exibiDialogoERRO("ERRO! Falha ao cadastrar CLIENTE.");
				e.printStackTrace();
			}
		}

    @FXML
    void btnLimpar() {
		txtNomeFuncionario.clear();
		txtCpf.clear();
		txtCargo.clear();
		txtSalario.clear();
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
