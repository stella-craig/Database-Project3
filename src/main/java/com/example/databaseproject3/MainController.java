package com.example.databaseproject3;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MainController {


    @FXML
    protected void onExitButtonClick()
    {
        Platform.exit();
    }
}
