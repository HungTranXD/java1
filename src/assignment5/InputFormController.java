package assignment5;

import javafx.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class InputFormController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtTel;
    public ListView<StudentInfo> listView;
    
    private StudentList list1 = new StudentList();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        int age = Integer.parseInt(txtAge.getText());
        String tel = txtTel.getText();

        list1.addStudent(name, email, address, age, tel);
        print();
    }
    public void print() {
        listView.setItems(list1.getList());
        listView.refresh();
    }
}
