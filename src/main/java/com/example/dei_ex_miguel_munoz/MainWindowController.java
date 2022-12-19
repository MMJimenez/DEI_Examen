package com.example.dei_ex_miguel_munoz;

import com.example.dei_ex_miguel_munoz.model.Person;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private Button btnAddToTable;

    @FXML
    private TableColumn<Person, String> colActivity;

    @FXML
    private TableColumn<Person, Integer> colAge;

    @FXML
    private TableColumn<Person, Double> colGER;

    @FXML
    private TableColumn<Person, Double> colGET;

    @FXML
    private TableColumn<Person, Integer> colHeight;

    @FXML
    private TableColumn<Person, String> colName;

    @FXML
    private TableColumn<Person, String> colSex;

    @FXML
    private TableColumn<Person, Double> colWeight;

    @FXML
    private ChoiceBox<String> inputActivity;

    @FXML
    private Spinner<Integer> inputAge;

    @FXML
    private Spinner<Integer> inputHeight;

    @FXML
    private TextField inputName;

    @FXML
    private ChoiceBox<String> inputSex;

    @FXML
    private Spinner<Double> inputWeight;

    @FXML
    private Label lblInfo;

    @FXML
    private TableView<Person> table;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inflateInputAge();
        inflateInputHeigth();
        inflateInputWeigth();
        inflateTable();
        inflateSexChoiceBox();
        inflateActivityChoiceBox();
    }

    private void inflateInputAge() {
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
        inputAge.setValueFactory(valueFactory);
    }

    private void inflateInputWeigth() {
        SpinnerValueFactory<Double> valueFactory =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(0.0, 400.0);
        inputWeight.setValueFactory(valueFactory);
    }

    private void inflateInputHeigth() {
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 300);
        inputHeight.setValueFactory(valueFactory);
    }

    private void inflateSexChoiceBox() {
        inputSex.getItems().clear();
        inputSex.getItems().add(Person.GENRE.MEN.getStr());
        inputSex.getItems().add(Person.GENRE.WOMEN.getStr());
        inputSex.setValue(inputSex.getItems().get(0));
    }

    private void inflateActivityChoiceBox() {
        inputActivity.getItems().clear();
        inputActivity.getItems().add(Person.ACTIVITY.MUY_LIGERA.getStr());
        inputActivity.getItems().add(Person.ACTIVITY.LIGERA.getStr());
        inputActivity.getItems().add(Person.ACTIVITY.MODERADA.getStr());
        inputActivity.getItems().add(Person.ACTIVITY.INTENSA.getStr());
        inputActivity.setValue(inputActivity.getItems().get(0));
    }

    private void inflateTable() {
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colSex.setCellValueFactory(new PropertyValueFactory("sex"));
        colSex.setCellValueFactory((var row) -> {
            Person person = row.getValue();
            var sex = new ReadOnlyObjectWrapper();
            sex.setValue(person.getSex().getStr());
            return sex;
        });
        colAge.setCellValueFactory(new PropertyValueFactory("age"));
        colWeight.setCellValueFactory(new PropertyValueFactory("weigth"));
        colHeight.setCellValueFactory(new PropertyValueFactory("heigth"));
        colActivity.setCellValueFactory(new PropertyValueFactory("activity"));
        colActivity.setCellValueFactory((var row) -> {
            Person person = row.getValue();
            var activity = new ReadOnlyObjectWrapper();
            activity.setValue(person.getActivity().getStr());
            return activity;
        });

        colGER.setCellValueFactory(new PropertyValueFactory("GER"));
        colGET.setCellValueFactory(new PropertyValueFactory("GET"));
    }

    @FXML
    void addToTheTable(ActionEvent event) {
        if (isNullInputs()) {
            return;
        }

        String name = inputName.getText();
        Person.GENRE sex = Person.GENRE.setGenreFrom(inputSex.getValue());
        Integer age = inputAge.getValue();
        Double weight = inputWeight.getValue();
        Integer height = inputHeight.getValue();
        Person.ACTIVITY activity = Person.ACTIVITY.setActivityFrom(inputActivity.getValue());

        Person person = new Person(name, sex, age, weight, height, activity);
        table.getItems().add(person);
        lblInfo.setText("Se ha añadido correctamente");
        lblInfo.setTextFill(Color.BLACK);
        clearInputs();
    }

    private boolean isNullInputs() {
        if (inputName.getText().equals("")) {
            lblInfo.setText("El campo Nombre no puede estar vacío.");
        } else if (inputAge.getValue() == null || inputAge.getValue() <= 0) {
            lblInfo.setText("El campo Edad no puede estar vacío, o ser menor de 0");
        } else if (inputWeight.getValue() == null || inputWeight.getValue() <= 0.0) {
            lblInfo.setText("El campo Peso no puede estar vacío, o ser menor de 0");
        } else if (inputHeight.getValue() == null || inputHeight.getValue() <= 0) {
            lblInfo.setText("El campo Altura no puede estar vacío, o ser menor de 0");
        } else {
            return false;
        }
        lblInfo.setTextFill(Color.web("#aa0000"));
        return true;
    }

    private void clearInputs() {
        inputName.setText("");
        inputAge.getValueFactory().setValue(0);
        inputWeight.getValueFactory().setValue(0.0);
        inputHeight.getValueFactory().setValue(0);
    }
}