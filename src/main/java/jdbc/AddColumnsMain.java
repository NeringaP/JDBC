package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddColumnsMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String username = "root";
        String password = "tuktukkascia123";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sqlString1 = "ALTER TABLE baldai ADD kaina DOUBLE";
            statement.executeUpdate(sqlString1);
            String sqlString2 = "ALTER TABLE baldai ADD svoris INT";
            statement.executeUpdate(sqlString2);
            System.out.println("Insrt was good");
        } catch (SQLException ex) {
            System.out.println("Insert was bad");
            ex.printStackTrace();
        }
    }
}
