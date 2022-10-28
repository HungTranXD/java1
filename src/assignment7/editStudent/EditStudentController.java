package assignment7.editStudent;

import assignment7.Main;
import assignment7.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditStudentController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public static Student editedStudent;
    public ComboBox<String> cbGender;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtName.setText(editedStudent.getName());
        txtEmail.setText(editedStudent.getEmail());
        txtMark.setText(Integer.toString(editedStudent.getMark()));

        ObservableList<String> genders = FXCollections.observableArrayList();
        genders.addAll("Male", "Female", "Other");
        cbGender.setItems(genders);
        cbGender.setValue(editedStudent.getGender());
    }

    public void backToListPage(ActionEvent actionEvent) throws Exception{
        Parent addStudentPage = FXMLLoader.load(getClass().getResource("../studentList/studentList.fxml"));
        Scene sc = new Scene(addStudentPage, 400, 600);
        Main.rootStage.setTitle("Student list");
        Main.rootStage.setScene(sc);
    }


    public void submit(ActionEvent actionEvent) throws Exception{
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            Integer mark = Integer.parseInt(txtMark.getText());
            if(mark < 0 || mark > 10) throw new Exception("Invalid mark");
            String gender = cbGender.getValue();

            editedStudent.setName(name);
            editedStudent.setEmail(email);
            editedStudent.setMark(mark);
            editedStudent.setGender(gender);

            backToListPage(null);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
