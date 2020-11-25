package client;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.util.LinkedHashMap;
import java.util.Map;

public class Controller {


    @FXML
    private TextField inputField;

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> nameColumnTable;

    @FXML
    private TableColumn<Person, String> surnameColumnTable;

    @FXML
    private ListView<String> listView;


    private ObservableList<String> wordList = FXCollections.observableArrayList();

    private Map<String, String> wordsMap = new LinkedHashMap<>();




    @FXML
    public void initialize(){

        nameColumnTable.setCellValueFactory(new PropertyValueFactory<>("name"));
        surnameColumnTable.setCellValueFactory(new PropertyValueFactory<>("surname"));


        listView.setItems(wordList);
    }

    @FXML
    public void addWord(){
        addWordToList();
        addWordToTable();
    }

    public void addWordToList(){
        String word = inputField.getText();
        if(!word.isBlank()){

            listView.getItems().add(word);
        }
        inputField.setText("");
    }

    public void addWordToTable(){

    }


    @FXML
    public void exit() {
        System.exit(0);
    }

    @FXML
    public void clearChat(){
        listView.getItems().clear();
    }

}
