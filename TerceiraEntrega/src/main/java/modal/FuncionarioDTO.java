package modal;

public class FuncionarioDTO {

	Integer id_funcio;
	String nome;
	String cargo;
	String salario;
	String cpf;
	
	public Integer getIdFuncio() {
		return id_funcio;
	}
	public void setIdFuncio(Integer idFuncio) {
		this.id_funcio = idFuncio;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer getId_funcio() {
		return id_funcio;
	}
	public void setId_funcio(Integer id_funcio) {
		this.id_funcio = id_funcio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}