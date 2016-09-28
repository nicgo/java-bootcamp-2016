package ModeloDeClases;
import java.sql.*;

import com.sun.javafx.css.converters.StringConverter;

/**
 * Created by Nico on 28/9/2016.
 */
public class Sql_Connection_Test {

    public static void main(String []args){
        try {
            String connectionUrl = "jdbc:sqlserver://;database=DB_Pronostico;integratedSecurity=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado!");
        }
        catch (SQLException ex)
        {
            System.out.println("Error!");
        }
    }

}
