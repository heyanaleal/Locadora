package modal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    public Statement stm; // Responsavel por preparar e realizar pesquisas no banco de dados;
    public ResultSet rs; // Responsavel por armazenar o resultado de um pesquisa passada para o statement;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/Locadora"; // O "Locadora" representa a minha database 
    private String usuario = "postgres"; // Usuario default
    private String senha = "123ana2007";
    public Connection conexao; // Responsavel por realizar a conex�o com o banco de dados;
    
    public Connection conectar() { // Metodo responsavel por realizar a conex�o;
        try {
            System.setProperty("jdbc.Drivers", driver); // Seta a propriedade do driver de conex�o;
            conexao = DriverManager.getConnection(caminho, usuario, senha); // Realiza a conex�o com o banco;
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro de conex�o!\nERRO: " + ex.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
		return conexao;
    }
    
    public void desconectar() { // Metodo responsavel por fechar a conex�o
        try {
            conexao.close(); // Fechar conex�o
            JOptionPane.showMessageDialog(null, "Conex�o fechada com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conex�o!\nERRO: " + ex.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}