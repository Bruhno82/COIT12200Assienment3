module projects.coit12200assignment3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens projects.coit12200assignment3 to javafx.fxml;
    exports projects.coit12200assignment3;
}
