package com.example.databaseproject3;

public class Functions_for_BReturnBook {


    public static int booksByTitle(String title)
    {
        //TODO: connect to database
        String prompt = "SELECT COUNT(*) as Num_Books FROM BOOK WHERE Title = ";
        prompt = prompt.concat(title);
        prompt = prompt.concat(" AND Curr_Location <> Orig_Location;");
        //TODO: return the answer the prompt would provide
        return 0;
    }

    public static int booksByISBN(String isbn)
    {
        //TODO: connect to database
        String prompt = "SELECT COUNT(*) as Num_Books FROM BOOK WHERE ISBN = ";
        prompt = prompt.concat(isbn);
        prompt = prompt.concat(" AND Curr_Location <> Orig_Location;");
        //TODO: return the answer the prompt would provide
        return 0;
    }

}
