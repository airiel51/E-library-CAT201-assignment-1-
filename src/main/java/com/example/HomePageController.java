package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomePageController {

    @FXML
    private void switchToBookPage() throws IOException {
        App.setRoot("book");
    }
}
