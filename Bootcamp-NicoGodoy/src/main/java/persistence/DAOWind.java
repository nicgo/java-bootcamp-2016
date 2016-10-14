package persistence;

import configuration.Singleton_Sql_Connection;
import domain.Wind;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 13/10/2016.
 */
public class DAOWind implements DataBaseAccess_Prototype<Wind,String> {
    @Override
    public void inserInto(Wind persistence) throws SQLException {
        Connection connection=null;
        try {
            connection= Singleton_Sql_Connection.getInstance().getConect();
            String SQL = "INSERT INTO Viento (id_viento,direccion,velocidad) VALUES (1,"
                    +persistence.getDirection()+","
                    +persistence.getVelocity()+")";
            Statement stmt = connection.createStatement();
            int count = stmt.executeUpdate(SQL);
            System.out.println("afected rows: " + count);
            stmt.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            connection.close();
        }
    }

    @Override
    public void deleteFrom(Wind persistence) throws SQLException {

    }

    @Override
    public Wind selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Wind> selectAllFrom() throws SQLException {
        return null;
    }
}
