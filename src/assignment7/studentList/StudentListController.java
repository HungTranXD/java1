package assignment7.studentList;

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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentListController implements Initializable {
    public ListView<Student> studentLv;

    private boolean sortOrder = true;

    public static ObservableList<Student> studentList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentLv.setItems(studentList);
    }

    public void goToAddPage(ActionEvent actionEvent) throws Exception{
        Parent addStudentPage = FXMLLoader.load(getClass().getResource("../addStudent/addStudent.fxml"));
        Scene sc = new Scene(addStudentPage, 400, 600);
        Main.rootStage.setTitle("Add student");
        Main.rootStage.setScene(sc);
    }

    public void sortByName(ActionEvent actionEvent) {
    }

    public void sortByMark(ActionEvent actionEvent) {
    }

}
