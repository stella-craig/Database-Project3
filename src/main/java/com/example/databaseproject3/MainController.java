package com.example.databaseproject3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static com.example.databaseproject3.Functions_for_BReturnBook.*;
import static com.example.databaseproject3.Functions_for_Find_Book_Info.*;

public class MainController {


    ///////////////////////////////////////////////////////
    //          Main-Menu.fmxl                           //
    ///////////////////////////////////////////////////////
    @FXML
    protected void onFindBookInfoButtonClick() throws IOException {
        //This opens the new collection window
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Find-Book-Info.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Find-Book-Info");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onNewBookButtonClick() throws IOException {
        //This opens the new collection window
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("New-Book.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("New-Book");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onBorrowsButtonClick() throws IOException {
        //This opens the new collection window
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Borrows.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Borrows");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onYourCollectionButtonClick() throws IOException {
        //This opens the new collection window
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Your-Collection.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Your-Collection");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onUpdateButtonClick() throws IOException {
        //This opens the new collection window
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Update.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Update");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onExitButtonClick()
    {
        Platform.exit();
    }






    ///////////////////////////////////////////////////////
    //          Find-Book-Info.fxml                      //
    ///////////////////////////////////////////////////////

    @FXML    Label FBIError;
    @FXML    Button FBIcancel;
    @FXML    TextField FBItitleBox;
    @FXML    TextField FBIisbnBox;
    @FXML    TextField FBIauthorFnameBox;
    @FXML    TextField FBIauthorLnameBox;
    @FXML    TextField FBIgenderBox;
    @FXML    TextField FBIyearPubBox;
    @FXML    TextField FBInumPagesBox;
    @FXML    TextField FBIgenreBox;
    @FXML    TextField FBIbookTypeBox;
    @FXML    Button FBIsubmit;


    @FXML
    protected void FBIonCancelButtonClick()
    {
        Stage stage = (Stage) FBIcancel.getScene().getWindow();
        stage.close();
    }


    @FXML
    protected void FBIonSubmitButtonClick() throws SQLException, ClassNotFoundException {
        if(FBItitleBox.getText() != null || FBItitleBox.getText().length() != 0)
        {
            String title = FBItitleBox.getText();
            searchByTitle(title);
            //TODO: open new stage that displays the results
        }
        else if(FBIisbnBox.getText() != null || FBIisbnBox.getText().length() != 0)
        {
            String isbn = FBIisbnBox.getText();
            searchByISBN(isbn);
            //TODO: open new stage that displays the results
        }
        else if(FBIauthorFnameBox.getText() != null || FBIauthorFnameBox.getText().length() != 0)
        {
            String fName = FBIauthorFnameBox.getText();
            searchByAuthorFName(fName);
            //TODO: open new stage that displays the results
        }
        else if(FBIauthorLnameBox.getText() != null || FBIauthorLnameBox.getText().length() != 0)
        {
            String lName = FBIauthorLnameBox.getText();
            searchByAuthorLName(lName);
            //TODO: open new stage that displays the results
        }
        else if(FBIgenderBox.getText() != null || FBIgenderBox.getText().length() != 0)
        {
            String gender = FBIgenderBox.getText();
            searchByAuthorGender(gender);
            //TODO: open new stage that displays the results
        }
        else if(FBIyearPubBox.getText() != null || FBIyearPubBox.getText().length() != 0)
        {
            String yearPub = FBIyearPubBox.getText();
            searchByYearPublished(yearPub);
            //TODO: open new stage that displays the results
        }
        else if(FBInumPagesBox.getText() != null || FBInumPagesBox.getText().length() != 0)
        {
            String numPages = FBInumPagesBox.getText();
            searchByPageNum(numPages);
            //TODO: open new stage that displays the results
        }
        else if(FBIgenreBox.getText() != null || FBIgenreBox.getText().length() != 0)
        {
            String genre = FBIgenreBox.getText();
            searchByGenre(genre);
            //TODO: open new stage that displays the results
        }
        else if(FBIbookTypeBox.getText() != null || FBIbookTypeBox.getText().length() != 0)
        {
            String bookType = FBIbookTypeBox.getText();
            searchByBookType(bookType);
            //TODO: open new stage that displays the results
        }
        else
        {
            FBIError.setText("Please specify your search.");
            return;
        }

        //Close stage
        Stage stage = (Stage) FBIsubmit.getScene().getWindow();
        stage.close();
    }





    ///////////////////////////////////////////////////////
    //          New-Book.fxml                            //
    ///////////////////////////////////////////////////////

    @FXML    Button NBback;


    @FXML
    protected void NBonBackButtonClick()
    {
        Stage stage = (Stage) NBback.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void NBonBoughtBookButtonClick()
    {

    }

    @FXML
    protected void NBonBorrowedBookButtonClick()
    {

    }


    ///////////////////////////////////////////////////////
    //          Borrows.fxml                             //
    ///////////////////////////////////////////////////////

    @FXML    Button Bback;


    @FXML
    protected void BonBackButtonClick()
    {
        Stage stage = (Stage) Bback.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void BonReturnButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("BReturnBook.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Return-Book");
        stage.setScene(scene);
        stage.show();
    }

    ///////////////////////////////////////////////////////
    //          BReturnBook.fxml                         //
    ///////////////////////////////////////////////////////

    @FXML    Button BRBback;
    @FXML    TextField BRBTitle;
    @FXML    TextField BRBISBN;
    @FXML    Button BRBsubmit;
    @FXML    TextField BRBerror;


    @FXML
    protected void BRBonBackButtonClick()
    {
        Stage stage = (Stage) BRBback.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void BRBonSubmitButtonClick()
    {
        int errorcode;
        if(BRBTitle.getText() != null || BRBTitle.getText().length() != 0)
        {
            //search text
            String title = BRBTitle.getText();
            errorcode = booksByTitle(title);
            if(errorcode == 1)
            {
                //change current location!
                String prompt = "UPDATE BOOK SET Curr_Location = Orig_Location WHERE title = ";
                prompt = prompt.concat(title);
                prompt = prompt.concat(";");
                //TODO: connect to database
            }
            else
            {
                //error with num of books... ask user to be more specific
                String error = "Your Title returned ";
                error = error.concat(String.valueOf(errorcode));
                error = error.concat(" number of results. Please try again.");
                BRBerror.setText(error);
                return;
            }
        }
        else if(BRBISBN.getText() != null || BRBISBN.getText().length() != 0)
        {
            //search isbn
            String isbn = BRBISBN.getText();
            errorcode = booksByISBN(isbn);
            if(errorcode == 1)
            {
                //change current location!
                String prompt = "UPDATE BOOK SET Curr_Location = Orig_Location WHERE ISBN = ";
                prompt = prompt.concat(isbn);
                prompt = prompt.concat(";");
                //TODO: connect to database
            }
            else
            {
                //error with num of books... ask user to be more specific
                String error = "Your ISBN returned ";
                error = error.concat(String.valueOf(errorcode));
                error = error.concat(" number of results. Please try again.");
                BRBerror.setText(error);
                return;
            }
        }
        else {
            //nothing was inputted
            //error it babes
            BRBerror.setText("Please input either title or isbn.");
            return;
        }

        Stage stage = (Stage) BRBsubmit.getScene().getWindow();
        stage.close();
    }



    ///////////////////////////////////////////////////////
    //          Your-Collection.fxml                     //
    ///////////////////////////////////////////////////////

    @FXML    Button YCback;

    @FXML
    protected void YConBackButtonClick()
    {
        Stage stage = (Stage) YCback.getScene().getWindow();
        stage.close();
    }






    ///////////////////////////////////////////////////////
    //          Update.fxml                              //
    ///////////////////////////////////////////////////////

    @FXML    Button Uback;


    @FXML
    protected void UonBackButtonClick()
    {
        Stage stage = (Stage) Uback.getScene().getWindow();
        stage.close();
    }


}
