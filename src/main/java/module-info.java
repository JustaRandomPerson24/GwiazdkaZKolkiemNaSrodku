module com.example.gwiazdkazkolkiemnasrodku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gwiazdkazkolkiemnasrodku to javafx.fxml;
    exports com.example.gwiazdkazkolkiemnasrodku;
}