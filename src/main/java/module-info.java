module com.example.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;


    opens com.example.mazebank to javafx.fxml;
    exports com.example.mazebank;
}