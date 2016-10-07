package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Nico on 28/9/2016.
 */
public class Singleton_Sql_Connection {

    private static Singleton_Sql_Connection singletonSql_connection = null;
    String connectionUrl = null;
    Connection conect = null;




    private Singleton_Sql_Connection(){

        connectionUrl="jdbc:sqlserver://;database=DB_Pronostico;integratedSecurity=true;";

            try {
                conect = DriverManager.getConnection(connectionUrl);
                System.out.println("Conected to DB!");
            }
            catch (SQLException ex)
            {
                System.out.println("Error! It's not possible connect to DB");
         }
    }

    public static Singleton_Sql_Connection getInstance()
    {
        if (singletonSql_connection ==null)
        {
            singletonSql_connection = new Singleton_Sql_Connection();
        }
        return singletonSql_connection;
    }

    public Connection getConect() {
        return conect;
    }
}
