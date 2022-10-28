package assignment8.addBook;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddBookController implements Initializable {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAuthor;
    public ComboBox<String> cbPublisher;
    public ComboBox<String> cbType;
    public TextField txtPrice;
    public TextField txtQuantity;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void add(ActionEvent actionEvent) {
    }
}
