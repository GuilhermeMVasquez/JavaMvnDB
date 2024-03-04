package com.example;
import java.sql.*;

public class ConnectDB
{
    private String address;
    private String user;
    private String password;
    private Connection connection;

    public ConnectDB(String address, String user, String password) {
        this.address = address;
        this.user = user;
        this.password = password;
        this.connection = connectTo();
    }

    private Connection connectTo(){
        Connection connection = null;
        try {
            String url = "jdbc:mysql://" + address + "?user=" + user+ "&password=" + password;
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Connect: " + e.getMessage());
        }
        return connection;
    }

    public Connection getConnection(){
        return connection;
    }

    public boolean close(){
        try{
            connection.close();
            return true;
        } catch(SQLException e){
            System.out.println("Close connection: " + e.getMessage());
            return false;
        }
    }
}
