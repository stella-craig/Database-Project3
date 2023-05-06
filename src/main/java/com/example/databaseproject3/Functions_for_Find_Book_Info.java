package com.example.databaseproject3;

import java.sql.*;
public class Functions_for_Find_Book_Info {

    //search by title function
    public static void searchByTitle(String title) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.Book WHERE Title = ";
            prompt = prompt.concat(title);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }

    public static void searchByISBN(String isbn) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM Book WHERE ISBN = ";
            prompt = prompt.concat(isbn);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }


    public static void searchByAuthorFName(String fName) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM Book WHERE ISBN = ";
            prompt = prompt.concat(fName);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }










}
