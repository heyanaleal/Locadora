package DTO;

public class Carro {
	
    String placa;
    String modelo;
    String cor;
    String marca;
    String ano;
    String preco;
    
	public Carro(String placa, String modelo,String cor,String marca,String ano, String preco) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.ano = ano;
		this.preco = preco;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	

}
