package ru.itis.javafx;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import lombok.SneakyThrows;

public class HelloController {

    private Socket socket = new Socket("localhost", 8080);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private GridPane gridPane;

    private String mySymbol;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    private boolean firstMove = true;

    public HelloController() throws IOException {
        printWriter = new PrintWriter(socket.getOutputStream(), true);
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        mySymbol = bufferedReader.readLine();
    }

    @FXML
    @SneakyThrows
    void onBtnClick(ActionEvent event) {
        if (firstMove && mySymbol.equals("O")) {
            setOpponentMove();
            firstMove = false;
        }

        Button button = (Button) event.getSource();
            button.setText(mySymbol);


        Integer column = GridPane.getColumnIndex(button) == null ? 0 : GridPane.getColumnIndex(button);
        Integer row = GridPane.getRowIndex(button) == null ? 0 : GridPane.getRowIndex(button);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(column);
        stringBuilder.append(" ");
        stringBuilder.append(row);

        printWriter.println(stringBuilder);
//        Thread thread = new Thread(this::setOpponentMove);
//        thread.start();
//        setOpponentMove();
//        Platform.runLater(this::setOpponentMove);
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                setOpponentMove();
                return null;
            }
        };

        //Update JavaFX UI from another thread
        System.out.println("done");
    }

    @FXML
    void initialize() throws IOException {
    }

    @SneakyThrows
    private void setOpponentMove() {
        String message = bufferedReader.readLine();
        if (message.startsWith("Winner")) {
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("YOU WON");
            a.show();
        } else {
            Integer oppColumn = Integer.parseInt(message.split(" ")[0]);
            Integer oppRow = Integer.parseInt(message.split(" ")[1]);
            gridPane.getChildren().forEach(b -> {
                Integer column1 = GridPane.getColumnIndex(b) == null ? 0 : GridPane.getColumnIndex(b);
                Integer row1 = GridPane.getRowIndex(b) == null ? 0 : GridPane.getRowIndex(b);
                if ((oppColumn.equals(column1)) && (oppRow.equals(row1)))
                   Platform.runLater(() ->((Button) b).setText(mySymbol.equals("X") ? "O" : "X"));
            });
        }
    }

}
