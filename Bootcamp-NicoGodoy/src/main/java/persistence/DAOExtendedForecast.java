package persistence;

import configuration.Singleton_Sql_Connection;
import domain.ExtendedForecast;
import domain.Forecast;
import domain.Location;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 13/10/2016.
 */
public class DAOExtendedForecast implements DataBaseTransactionAccess_Prototype<ExtendedForecast,String,Forecast>{

    @Override
    public void inserInto(ExtendedForecast persistence, Forecast reference) throws SQLException {
        Connection connection=Singleton_Sql_Connection.getInstance().getConect();
        try {
            java.sql.Date dateSQL_ext = new java.sql.Date(persistence.getDate().getTime().getTime());
            java.sql.Date dateSQL_reference = new java.sql.Date(reference.getDay().getDate().getTime().getTime());
            String SQL = "INSERT INTO Pronostico_Extendido VALUES ('"+dateSQL_reference
                    +"','"+reference.getLocation().getCity()+"','"+reference.getLocation().getCountry()+"','"+reference.getLocation().getRegion()
                    +"',"+persistence.getLow()
                    +","+persistence.getHigh()
                    +","+persistence.getIdDescription()
                    +",'"+persistence.getDay().toString()
                    +"','"+dateSQL_ext+"')";
            Statement stmt = connection.createStatement();
            System.out.println(SQL);

            int count = stmt.executeUpdate(SQL);
            System.out.println("Extended Forecast Added to DB!, afected rows: " + count);
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
    public void deleteFrom(ExtendedForecast persistence) throws SQLException {

    }

    @Override
    public ExtendedForecast selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<ExtendedForecast> selectAllFrom() throws SQLException {
        return null;
    }
}
