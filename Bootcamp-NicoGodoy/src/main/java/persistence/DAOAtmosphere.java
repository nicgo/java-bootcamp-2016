package persistence;

import configuration.Singleton_Sql_Connection;
import domain.Atmosphere;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 13/10/2016.
 */
public class DAOAtmosphere implements DataBaseAccess_Prototype<Atmosphere,String> {


    @Override
    public void inserInto(Atmosphere persistence) throws SQLException {
        Connection connection=null;
        try {
            connection= Singleton_Sql_Connection.getInstance().getConect();
            String SQL = "INSERT INTO Atmosfera (id_atmosfera,humedad,presion,visibilidad,ambiente_asc) VALUES (2,"
                    +persistence.getHumidity()+","
                    +persistence.getPressure()+","
                    +persistence.getVisibility()+","
                    +persistence.getRising()+")";
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
    public void deleteFrom(Atmosphere persistence) throws SQLException {

    }

    @Override
    public Atmosphere selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Atmosphere> selectAllFrom() throws SQLException {
        return null;
    }
}
