module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive javafx.graphics;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.bootstrapicons;
    requires MaterialFX;

    opens com.example to javafx.fxml;
    exports com.example;
}
