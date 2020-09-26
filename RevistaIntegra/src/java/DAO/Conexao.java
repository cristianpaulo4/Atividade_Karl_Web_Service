package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class Conexao {

    private static final String USUARIO = "root";
    private static final String SENHA = "nunes@142536";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/revistaintegra";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectado");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conecatar");
        }
        return null;

    }

}
