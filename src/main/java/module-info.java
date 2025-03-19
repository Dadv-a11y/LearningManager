module com.example.learningmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learningmanager to javafx.fxml;
    exports com.example.learningmanager;
}