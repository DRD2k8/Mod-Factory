module com.modfactory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.modfactory to javafx.fxml;
    exports com.modfactory;
}