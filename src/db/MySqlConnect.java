package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class MySqlConnect {

    public static Properties load(){
        Properties prop = new Properties();
        try {
            InputStream ism = Files.newInputStream(Paths.get("/Users/nacer-zimu/IdeaProjects/Nov22Project2/secret.properties"));
            prop.load(ism);
            ism.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
    public static Connection connectToMySQL(){
        Properties prop = load();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String username = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("database is connected");
        return connect;
    }
    public static void main(String[] args) throws SQLException {

        Connection connection = connectToMySQL();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from profile;");

        while (rs.next()){
            String str = rs.getString("id");
            System.out.println(str);
        }

    }
}
