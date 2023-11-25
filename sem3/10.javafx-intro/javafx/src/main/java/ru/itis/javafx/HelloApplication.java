package ru.itis.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Circle circle;

    @Override
    public void start(Stage stage) throws IOException {
        circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);

        Text text = new Text("Hi there!");
        text.setY(200);
        text.setX(200);

        //style
        circle.setFill(Color.RED);
        circle.setStroke(Color.GREEN);

        text.setFill(Color.BLUE);
        text.setFont(Font.font("Times New Roman",33));

//        text.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-fill: red");

//        Pane pane = new Pane();
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);

//        //Stack Pane
//        StackPane pane = new StackPane();
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);

//        //HBox
//        HBox pane = new HBox();
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);

//        //VBox
//        VBox pane = new VBox();
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);

        // FlowPane
//        FlowPane pane = new FlowPane();
//        pane.getChildren().add(circle);
//        pane.getChildren().add(text);
//        pane.setOrientation(Orientation.VERTICAL);

        // GridPane
//        GridPane pane = new GridPane();
//        pane.add(text,2,2);
//        pane.add(circle,0,0);

        // BorderPane
//        BorderPane pane = new BorderPane();
//        StackPane pane1 = new StackPane();
//        pane1.getChildren().add(circle);
//        pane1.getChildren().add(text);
//        pane.setCenter(pane1);

//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(circle);
//        Button button = new Button("Press me");
//        button.setOnAction(ai ->{
//            if (circle.getRadius()==0) circle.setRadius(60);
//            else circle.setRadius(circle.getRadius()-10);
//        });
//        borderPane.setBottom(button);

        Pane pane = new Pane();
        Text text1 = new Text("Hi from Java app");
        text1.setX(200);
        text1.setY(200);
        text1.setOnMouseDragged(me ->{
            text1.setX(me.getX());
            text1.setY(me.getY());
        });
        pane.getChildren().add(text1);

        Scene scene = new Scene(pane,400,400);
        stage.setScene(scene);
        stage.show();
    }

    class MyHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            if (circle.getRadius()==0) circle.setRadius(60);
            else circle.setRadius(circle.getRadius()-10);
        }
    }


    public static void main(String[] args) {
        launch();
    }
}