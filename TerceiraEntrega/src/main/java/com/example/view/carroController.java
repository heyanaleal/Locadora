package com.example.view;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import modal.CarroDAO;
import modal.CarroDTO;

public class carroController {
	
	CarroDTO c ;

    @FXML
    private Tab Carro;

    @FXML
    private TableColumn<CarroDTO, String> ColId;
    
    @FXML
    private TableColumn<CarroDTO, String> ColAno;

    @FXML
    private TableColumn<CarroDTO, String> ColCor;

    @FXML
    private TableColumn<CarroDTO, String> ColMarca;

    @FXML
    private TableColumn<CarroDTO, String> ColModelo;

    @FXML
    private TableColumn<CarroDTO, String> ColPlaca;

    @FXML
    private TableColumn<CarroDTO, String> ColPreco;

    @FXML
    private Tab Consultar;

    @FXML
    private TableView<CarroDTO> TableCarro;

    @FXML
    private TextField txtAno;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPreco;
    
    @FXML
    void btnCadastrar() {
    	CarroDTO c = new CarroDTO();
		
    	
    	c.setPlaca(txtPlaca.getText());
	    c.setModelo(txtModelo.getText());  
	    c.setCor(txtCor.getText());
		c.setMarca(txtMarca.getText());
		c.setAno(txtAno.getText());
		c.setPreco(txtPreco.getText());
	

		try {
			CarroDAO dao = new CarroDAO ();
			dao.cadastrar(c);
			exibiDialogoINFO("Carro cadastrado com SUCESSO!");
			 
			btnLimpar();
			

		} catch (Exception e) {
			// TODO: handle exception
			exibiDialogoERRO("ERRO! Falha ao cadastrar CARRO.");
			e.printStackTrace();
		}
	}
    	
    @FXML
    void Consultar() {
    }
 
    @FXML
    void btnLimpar() {
    	
    	txtPlaca.clear();
    	txtModelo.clear();
    	txtCor.clear();
    	txtMarca.clear();
    	txtAno.clear();
    	txtPreco.clear();
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

	@SuppressWarnings("unused")
	private boolean exibiDialogoConfirmacao(String confirmacao) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmação");
		alert.setHeaderText(null);
		alert.setContentText(confirmacao);

		Optional<ButtonType> opcao = alert.showAndWait();

		if (opcao.get() == ButtonType.OK)
			return true;
		return false;

	}
}
