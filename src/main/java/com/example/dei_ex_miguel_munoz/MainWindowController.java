package com.example.dei_ex_miguel_munoz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private Button btnAddToTable;

    @FXML
    private TableColumn<?, ?> colActivity;

    @FXML
    private TableColumn<?, ?> colAge;

    @FXML
    private TableColumn<?, ?> colGER;

    @FXML
    private TableColumn<?, ?> colGET;

    @FXML
    private TableColumn<?, ?> colHeight;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSex;

    @FXML
    private TableColumn<?, ?> colWeight;

    @FXML
    private ComboBox<?> inputActivity;

    @FXML
    private Spinner<?> inputAge;

    @FXML
    private Spinner<?> inputHeight;

    @FXML
    private TextField inputName;

    @FXML
    private ComboBox<?> inputSex;

    @FXML
    private Spinner<?> inputWeight;

    @FXML
    private Label lblInfo;

    @FXML
    private TableView<?> table;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        inflateTable();
    }

    private void inflateTable() {
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
    }

    private void addPerson(ActionEvent event) throws IOException {

    }
}
