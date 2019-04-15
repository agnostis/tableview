import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;


public class mainController {

    private ObservableList<Person> personData = FXCollections.observableArrayList();
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<String, Person> name;
    @FXML
    private TextField inputName;

    @FXML
    private void initialize (){
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        personTable.setItems(personData);
        initData();
    }

    private void initData (){
        personData.add(new Person(inputName.getText()));
    }

    @FXML
    private void showDialog() throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("second.fxml"));
        Stage secondStage = new Stage();
        secondStage.setScene(new Scene(loader));
        secondStage.show();
    }


}
