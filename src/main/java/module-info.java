module com.example.databaseproject3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.databaseproject3 to javafx.fxml;
    exports com.example.databaseproject3;
}