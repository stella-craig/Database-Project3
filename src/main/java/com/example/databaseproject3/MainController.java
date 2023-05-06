package com.example.databaseproject3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
        Platform.exit();
    }

    @FXML
    protected void FBIonSubmitButtonClick()
    {
        Platform.exit();
    }


    ///////////////////////////////////////////////////////
    //          New-Book.fxml                            //
    ///////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////
    //          Borrows.fxml                             //
    ///////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////
    //          Your-Collection.fxml                     //
    ///////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////
    //          Update.fxml                              //
    ///////////////////////////////////////////////////////



}
