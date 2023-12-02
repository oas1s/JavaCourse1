module ru.itis.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.itis.javafx to javafx.fxml;
    exports ru.itis.javafx;
}