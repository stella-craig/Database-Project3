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
            String prompt = "SELECT * FROM home_library.book JOIN home_library.author ON book.Author_id = author.Author_id WHERE author.First_Name = ";
            prompt = prompt.concat(fName);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }

    public static void searchByAuthorLName(String lName) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book JOIN home_library.author ON book.Author_id = author.Author_id WHERE author.Last_Name = ";
            prompt = prompt.concat(lName);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }

    public static void searchByAuthorGender(String gender) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book JOIN home_library.author ON book.Author_id = author.Author_id WHERE author.Gender = ";
            prompt = prompt.concat(gender);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }

    public static void searchByYearPublished(String yearPub) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Year_Published = ";
            prompt = prompt.concat(yearPub);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }


    public static void searchByPageNum(String numPages) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Num_of_Pages = ";
            prompt = prompt.concat(numPages);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }


    public static void searchByGenre(String genre) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book JOIN home_library.genre ON book.Genre = genre.Genre_id WHERE genre.Genre_Name = ";
            prompt = prompt.concat(genre);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }

    public static void searchByBookType(String type) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Book_Type = ";
            prompt = prompt.concat(type);
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }


}
