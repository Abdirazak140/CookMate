module com.example.cookmate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cookmate to javafx.fxml;
    exports com.example.cookmate;
}