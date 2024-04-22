package tn.arteco.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyDataBase {
    final String URL = "jdbc:mysql://localhost:3306/arteco";
    final String USER = "root";
   final String PASSWORD = "";
    private static Connection connection ;
    private static MyDataBase instance  ;

    private MyDataBase()  {
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("not connected");
        }
    }
    public static MyDataBase getInstance(){
        if (instance == null){
            instance = new MyDataBase();
        }
        return instance ;
    }
    public Connection getConnection() {
        return connection;
    }

}