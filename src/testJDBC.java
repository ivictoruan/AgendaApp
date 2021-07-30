import java.sql.*;
import java.util.List;


public class testJDBC {

    public static Connection connection;


    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        dao.adiciona(new Contato("lucas", "lucas135@gmail.com", "33911315"));
        List<Contato> contatos = dao.recupera();
        for (Contato contato: contatos) {
            System.out.println(contato);
        }
    }

}
