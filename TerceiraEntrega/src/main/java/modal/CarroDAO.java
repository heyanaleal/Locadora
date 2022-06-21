package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarroDAO {

	public void cadastrar(CarroDTO c) {
		
		
		String sql = "INSERT INTO Carro (placa, modelo, cor, marca, ano, preco) VALUES (?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = new ConnectionFactory().conectar(); PreparedStatement stm = conn.prepareStatement(sql);){
			
		
			stm.setString(1, c.getPlaca());
			stm.setString(2, c.getModelo());
			stm.setString(3, c.getCor());
			stm.setString(4, c.getMarca());
			stm.setString(5, c.getAno());
			stm.setString(6, c.getPreco());
			
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}	

}
