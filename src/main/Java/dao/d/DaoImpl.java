package dao.d;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by в on 23.06.2016.
 */
public class DaoImpl {

    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/clean_paper";
    private static String user = "root";
    private static String password = "qawsed";

    private static Connection getConnection(){
        if (connection==null){
            try {
                connection = DriverManager.getConnection(url,user,password);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static List showAllThings(){
        Statement statement= null;
        ResultSet resultSet=null;
        List list=new ArrayList();
        try {
            statement = getConnection().createStatement();
            statement.execute("SELECT * FROM fing");
            resultSet=statement.getResultSet();
            while (resultSet.next()){
                list.add(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            if (statement!=null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (resultSet!=null)
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return list;
    }
}
