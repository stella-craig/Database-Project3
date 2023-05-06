package com.example.databaseproject3;

public class Functions_for_BReturnBook {


    public static int booksByTitle(String title)
    {
        String prompt = "SELECT COUNT(*) as Num_Books FROM BOOK WHERE Title = ";
        prompt = prompt.concat(title);
        prompt = prompt.concat(" AND Curr_Location <> Orig_Location;");
        return 0;
    }

}
