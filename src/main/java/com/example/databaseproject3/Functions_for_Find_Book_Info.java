package com.example.databaseproject3;

import java.sql.*;
public class Functions_for_Find_Book_Info {

    //search by title function
    public static void searchByTitle(String title) throws SQLException {
        Statement stmt = conn.createStatement();
        String prompt = "SELECT * FROM Book WHERE Title = ";
        prompt = prompt.concat(title);
        ResultSet rs = stmt.executeQuery(prompt);
    }


    public static void searchByISBN(String isbn) throws SQLException {
        Statement stmt = conn.createStatement();
        String prompt = "SELECT * FROM Book WHERE ISBN = ";
        prompt = prompt.concat(isbn);
        ResultSet rs = stmt.executeQuery(prompt);
    }




}
