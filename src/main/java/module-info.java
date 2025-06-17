module com.ntdk.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntdk.quizapp to javafx.fxml;
    exports com.ntdk.quizapp;
}
