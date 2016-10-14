package persistence;

import configuration.Singleton_Sql_Connection;
import domain.CurrentDay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 13/10/2016.
 */
public class DAOCurrentDay implements DataBaseAccess_Prototype<CurrentDay,String> {
    @Override
    public void inserInto(CurrentDay persistence) throws SQLException {
        Connection connection=null;
        java.sql.Date dateSQL = new java.sql.Date(persistence.getDate().getTime().getTime());//date is converted to an SQL date
        try {
            connection= Singleton_Sql_Connection.getInstance().getConect();
            String SQL = "INSERT INTO DiaActual (fecha,temp,descripcion) VALUES (?,"+persistence.getTemp()+","+persistence.getIdDescription()+")";
            PreparedStatement stmt = connection.prepareStatement(SQL);
            stmt.setDate(1,dateSQL);
            int count = stmt.executeUpdate();

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
    public void deleteFrom(CurrentDay persistence) throws SQLException {

    }

    @Override
    public CurrentDay selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<CurrentDay> selectAllFrom() throws SQLException {
        return null;
    }
}
