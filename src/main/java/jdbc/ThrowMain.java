package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThrowMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String username = "root";
        String password = "tuktukkascia123";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM baldai");
        List<Baldai> baldaiList = new ArrayList<Baldai>();
        while(resultSet.next()) {
            Baldai baldai = new Baldai();
            baldai.setId(resultSet.getInt("id"));
            baldai.setName(resultSet.getString("name"));
            baldai.setKaina(resultSet.getDouble("kaina"));
            baldai.setSvoris(resultSet.getInt("svoris"));
            baldaiList.add(baldai);
        }
        statement.close();
        resultSet.close();

        for (Baldai baldas : baldaiList) {
            System.out.println("ID: " + baldas.getId() + ", Name: " + baldas.getName() +
                    ", Kaina: " + baldas.getKaina() + "£, Svoris: " + baldas.getSvoris() + "kg");
        }
    }
}
