package persistence;

import configuration.Singleton_Sql_Connection;
import domain.Location;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Nico on 13/10/2016.
 */
public class DAOLocation implements DataBaseAccess_Prototype<Location,String> {
    @Override
    public void inserInto(Location persistence) throws SQLException {
        Connection connection=null;
        try{
            connection = Singleton_Sql_Connection.getInstance().getConect();
            //writes new country on DB
            try {

                String SQL = "INSERT INTO Pais (nombre_Pais) VALUES ('" + persistence.getCountry() + "')";
                Statement stmt = connection.createStatement();
                int count = stmt.executeUpdate(SQL);
                System.out.println("afected rows: " + count);
                stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }

            //writes new region on DB
            try {
                String SQL = "INSERT INTO Region (nombre_Pais,nombre_Region) VALUES ('" +persistence.getCountry()
                        + "','" + persistence.getRegion() + "')";
                Statement stmt = connection.createStatement();
                int count = stmt.executeUpdate(SQL);
                System.out.println("afected rows: " + count);
                stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }


            //writes new city on DB
            try {
                String SQL = "INSERT INTO Ciudad (nombre_Pais,nombre_Region,nombre_Ciudad) VALUES ('"
                        + persistence.getCountry() + "','"
                        + persistence.getRegion() + "','"
                        + persistence.getCity() + "')";
                Statement stmt = connection.createStatement();
                int count = stmt.executeUpdate(SQL);
                System.out.println("afected rows: " + count);
                stmt.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            connection.close();
        }
    }

    @Override
    public void deleteFrom(Location persistence) throws SQLException {

    }

    @Override
    public Location selectFromWhere(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Location> selectAllFrom() throws SQLException {
        return null;
    }
}
