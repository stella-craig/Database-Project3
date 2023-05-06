package com.example.databaseproject3;

import java.sql.*;
public class Functions_for_Find_Book_Info {

    //search by title function
    public static void searchByTitle(String title) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Hickman21!";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM home_library.Book WHERE Title LIKE ?")) {
            stmt.setString(1, "%" + title + "%");
            ResultSet rs = stmt.executeQuery();
            boolean found = false;

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                found = true;
                // print all columns dynamically
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + " ");
                }
                System.out.println();
            }
            conn.close();
            if (!found) {
                System.out.println("No books found with the title: " + title);
            }
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }
    }



    public static void searchByISBN(String isbn) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM home_library.Book WHERE ISBN = ?")) {
            stmt.setString(1, isbn);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            boolean found = false;
            while (rs.next()) {
                found = true;
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + " ");
                }
                System.out.println();
            }
            conn.close();
            if (!found) {
                System.out.println("No books found with the ISBN: " + isbn);
            }

        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }


    }



    public static void searchByAuthorFName(String fName) throws SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Hickman21!";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM home_library.book JOIN home_library.author ON book.Author_id = author.Author_id WHERE author.First_Name = ?")) {
            stmt.setString(1, fName);
            ResultSet rs = stmt.executeQuery();
            boolean found = false;

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                found = true;
                // print all columns dynamically
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + " ");
                }
                System.out.println();
            }
            if (!found) {
                System.out.println("No books found with the author's first name: " + fName);
            }
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }
    }


    public static void searchByAuthorLName(String lName) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Hickman21!";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM home_library.book JOIN home_library.author ON book.Author_id = author.Author_id WHERE author.Last_Name = ?")) {
            stmt.setString(1, lName);
            ResultSet rs = stmt.executeQuery();
            boolean found = false;

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                found = true;
                // print all columns dynamically
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + " ");
                }
                System.out.println();
            }
            if (!found) {
                System.out.println("No books found with the author's last name: " + lName);
            }
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }
    }


    public static void searchByAuthorGender(String gender) throws SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Hickman21!";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM home_library.Book JOIN home_library.Author ON Book.Author_id = Author.Author_id WHERE Author.Gender = ?")) {
            stmt.setString(1, gender);
            ResultSet rs = stmt.executeQuery();
            boolean found = false;

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                found = true;
                // print all columns dynamically
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + " ");
                }
                System.out.println();
            }
            if (!found) {
                System.out.println("No authors found with the gender: " + gender);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }
    }


    public static void searchByYearPublished(String yearPub) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String username = "root";
        String password = "Hickman21!";

        try {
          //  Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Year_Published = ";
            prompt = prompt.concat(yearPub);
            prompt = prompt.concat(";");
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
        //    Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Num_of_Pages = ";
            prompt = prompt.concat(numPages);
            prompt = prompt.concat(";");
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
          //  Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book JOIN home_library.genre ON book.Genre = genre.Genre_id WHERE genre.Genre_Name = ";
            prompt = prompt.concat(genre);
            prompt = prompt.concat(";");
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
         //   Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            // Do something with the connection...
            Statement stmt = conn.createStatement();
            String prompt = "SELECT * FROM home_library.book WHERE book.Book_Type = ";
            prompt = prompt.concat(type);
            prompt = prompt.concat(";");
            ResultSet rs = stmt.executeQuery(prompt);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database: " + e.getMessage());
        }

    }


}
