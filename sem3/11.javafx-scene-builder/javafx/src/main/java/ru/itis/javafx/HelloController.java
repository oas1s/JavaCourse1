package ru.itis.javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char currentSymbol = 'X';
    private char[][] symbols = new char[3][3];

    @FXML
    void onBtnClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        button.setText(String.valueOf(currentSymbol));
        currentSymbol = currentSymbol == 'X' ? 'O' : 'X';

        Integer column = GridPane.getColumnIndex(button)  == null ? 0 : GridPane.getColumnIndex(button);
        Integer row = GridPane.getRowIndex(button) == null ? 0 : GridPane.getRowIndex(button);
        System.out.println(column);
        System.out.println(row);
    }

    @FXML
    void initialize() {

    }

}
