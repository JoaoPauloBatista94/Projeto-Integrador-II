package projeto.senac.pin.aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class BancoDeDados {

	public Connection getConnection() {
        String url = "jdbc:postgresql://localhost:3306/Senac_bd";  
        String usuario = "root";  
        String senha = ""; 
		Connection result = null;
		try {
			Class.forName("org.postgresql.Driver");
			result = DriverManager.getConnection(url, usuario, senha);
			return result;                        
        }  
        catch(Exception e){  
			JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);  
        }
		return result;
	}
}

/*public class BancoDeDados {

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("jdbc:mysql://localhost:3306/testebd");
			return DriverManager.getConnection("com.mysql.jdbc.Driver","root","");
		}catch (ClassNotFoundException e) {
			throw new SQLDataException(e.getMessage());
		}
	}
}
*/