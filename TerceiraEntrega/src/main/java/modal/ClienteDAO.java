package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
	public void cadastrar(ClienteDTO cliente) {
		
		String sql = "INSERT INTO Cliente (cpf, nome_cliente, endereco, telefone) VALUES (?, ?, ?, ?)";
		
		try(Connection conn = new ConnectionFactory().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
			
		
			
			stm.setString(1, cliente.getCpf());
			stm.setString(2, cliente.getNome());
			stm.setString(3, cliente.getEndereco());
			stm.setString(4, cliente.getTelefone());
			
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}	

}
