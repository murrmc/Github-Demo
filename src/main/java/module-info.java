module com.mycompany.testfxml_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.testfxml_project to javafx.fxml;
    exports com.mycompany.testfxml_project;
}
