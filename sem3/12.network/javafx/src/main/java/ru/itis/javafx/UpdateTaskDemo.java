package ru.itis.javafx;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class UpdateTaskDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        Button runOnFXThreadButton = new Button("Update on FX Thread");
        Button runInTaskButton = new Button("Update in background Task");
        HBox buttons = new HBox(10, runOnFXThreadButton, runInTaskButton);
        buttons.setPadding(new Insets(10));
        VBox root = new VBox(10, label, buttons, new TextField());
        root.setPadding(new Insets(10));

        runOnFXThreadButton.setOnAction(event -> {
            for (int i=1; i<=10; i++) {
                label.setText("Count: "+i);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException exc) {
                    throw new Error("Unexpected interruption");
                }
            }

        });

        runInTaskButton.setOnAction(event -> {
            Task<Void> task = new Task<Void>() {
                @Override 
                public Void call() throws Exception {
                    for (int i=1; i<=10; i++) {
                        updateMessage("Count: "+i);
                        Thread.sleep(250);
                    }
                    return null ;
                }
            };
            task.messageProperty().addListener((obs, oldMessage, newMessage) -> label.setText(newMessage));
            new Thread(task).start();
        });

        primaryStage.setScene(new Scene(root, 400, 225));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}