package loja;


public class Funcionario {
    String cargo;
    String nome;
    float salario;

    public float get_salario(){
        return salario;
    }
    public void set_salario(float novo_salario){
         salario = novo_salario;
    }
    
    public void imprimr() {
    	System.out.println("O nome do funcionário é: "+ nome + " o funcionario recebe: " + salario +" e tem o cargo de "+ cargo);
    }
}
