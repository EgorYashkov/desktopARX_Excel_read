module com.example.lrtu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lrtu to javafx.fxml;
    exports com.example.lrtu;
}