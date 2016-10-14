package persistence;

import configuration.Singleton_Sql_Connection;
import domain.Forecast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 14/10/2016.
 */
public class DAOForecast implements DataBaseAccess_Prototype<Forecast,String>{
    @Override
    public void inserInto(Forecast persistence) throws SQLException {
        Connection connection=null;
        java.sql.Date dateSQL = new java.sql.Date(persistence.getDay().getDate().getTime().getTime());
        try {
            connection= Singleton_Sql_Connection.getInstance().getConect();
            String SQL = "INSERT INTO Pronostico VALUES ('"+dateSQL
                    +"','"+persistence.getLocation().getCity()+"','"+persistence.getLocation().getCountry()+"','"+persistence.getLocation().getRegion()
                    +"',1,1)";// harcode for Atmosphere and Wind Id
            Statement stmt = connection.createStatement();
            int count = stmt.executeUpdate(SQL);
            System.out.println("Forecast Added to DB!, afected rows: " + count);
            stmt.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteFrom(Forecast persistence) throws SQLException {

    }

    @Override
    public Forecast selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Forecast> selectAllFrom() throws SQLException {
        return null;
    }
}
