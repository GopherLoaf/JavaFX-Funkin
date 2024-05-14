module com.example.javafxfridaynightfunkin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.example.javafxfridaynightfunkin to javafx.fxml;
    exports com.example.javafxfridaynightfunkin;
}