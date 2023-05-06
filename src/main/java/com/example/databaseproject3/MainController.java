package com.example.databaseproject3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

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

    @FXML
    protected void FBIonCancelButtonClick()
    {
        Stage stage = (Stage) FBIcancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void FBIonSubmitButtonClick() throws SQLException {
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
        else if(FBIauthorFNameBox.getText() != null || FBIauthorFNameBox.getText().length() != 0)
        {
            String fName = FBIauthorFNameBox.getText();
            searchByAuthorFName(fName);
            //TODO: open new stage that displays the results
        }
        else if(FBIauthorLNameBox.getText() != null || FBIauthorLNameBox.getText().length() != 0)
        {
            String lName = FBIauthorLNameBox.getText();
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
            //TODO: put search by number of pages function here
            //TODO: open new stage that displays the results
        }
        else if(FBIgenreBox.getText() != null || FBIgenreBox.getText().length() != 0)
        {
            String genre = FBIgenreBox.getText();
            //TODO: put search by genre function here
            //TODO: open new stage that displays the results
        }
        else if(FBIbookTypeBox.getText() != null || FBIbookTypeBox.getText().length() != 0)
        {
            String bookType = FBIbookTypeBox.getText();
            //TODO: put search by book type function here
            //TODO: open new stage that displays the results
        }






        //Close stage
        Stage stage = (Stage) FBIsubmit.getScene().getWindow();
        stage.close();
    }





    ///////////////////////////////////////////////////////
    //          New-Book.fxml                            //
    ///////////////////////////////////////////////////////

    @FXML
    protected void NBonBackButtonClick()
    {
        Stage stage = (Stage) NBback.getScene().getWindow();
        stage.close();
    }





    ///////////////////////////////////////////////////////
    //          Borrows.fxml                             //
    ///////////////////////////////////////////////////////

    @FXML
    protected void BonBackButtonClick()
    {
        Stage stage = (Stage) Bback.getScene().getWindow();
        stage.close();
    }






    ///////////////////////////////////////////////////////
    //          Your-Collection.fxml                     //
    ///////////////////////////////////////////////////////

    @FXML
    protected void YConBackButtonClick()
    {
        Stage stage = (Stage) YCback.getScene().getWindow();
        stage.close();
    }






    ///////////////////////////////////////////////////////
    //          Update.fxml                              //
    ///////////////////////////////////////////////////////

    @FXML
    protected void UonBackButtonClick()
    {
        Stage stage = (Stage) Uback.getScene().getWindow();
        stage.close();
    }


}
