package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ContactController {
    public TextField txtName; //chú ý import đúng gói javafx
    public TextField txtEmail; //chú ý import đúng gói javafx

    public ListView<Contact> lv;

    private ObservableList<Contact> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        ls.add(new Contact(name, email));
        print();

    }
    public void print() {
        lv.setItems(ls);
    }
}
