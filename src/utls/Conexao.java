package utls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iago
 */
public class Conexao {
    public static Connection getConexao() {
        try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root123");
        System.out.println("Conectado com sucesso:");
        return connection;
        } catch (SQLException e) {  
            System.out.println("Erro ao conectar com o bando de dados:"+ e);
        }
        return null;
    }
    // apagar essa linha depois //
    public static void main (String[] args){
        Conexao.getConexao();
    }
}
