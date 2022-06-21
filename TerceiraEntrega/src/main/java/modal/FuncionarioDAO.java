package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
	public void cadastrar(FuncionarioDTO funcio) {
		
		String sql = "INSERT INTO Funcionario (cpf, nome, cargo, salario) VALUES (?, ?, ?, ?)";
		
		try(Connection conn = new ConnectionFactory().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
			//PreparedStatement stm = connection.prepareStatement(sql);
			
		
			
			stm.setString(1, funcio.getCpf());
			stm.setString(2, funcio.getNome());
			stm.setString(3, funcio.getCargo());
			stm.setString(4, funcio.getSalario());
			
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
