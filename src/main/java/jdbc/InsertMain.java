package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String username = "root";
        String password = "tuktukkascia123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter baldas name");
        String naujasBaldasName = scanner.next();
        System.out.println("Enter baldas kaina");
        String naujasBaldasKaina = scanner.next();
        System.out.println("Enter baldas svoris");
        String naujasBaldasSvoris = scanner.next();

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sqlString = "INSERT INTO baldai (name, kaina, svoris) VALUES ('" + naujasBaldasName + "'," +
                    naujasBaldasKaina + "," + naujasBaldasSvoris + ")";
            statement.executeUpdate(sqlString);
            System.out.println("Insert was good");
            connection.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Insert was bad");
            ex.printStackTrace();
        }
    }
}
