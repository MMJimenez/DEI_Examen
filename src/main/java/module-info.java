module com.example.dei_ex_miguel_munoz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dei_ex_miguel_munoz to javafx.fxml;
    exports com.example.dei_ex_miguel_munoz;
}