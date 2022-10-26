package assignment7.studentList;

import assignment7.Main;
import assignment7.Student;
import assignment7.editStudent.EditStudentController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
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
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortOrder? o1.getName().compareTo(o2.getName()) : o2.getName().compareTo(o1.getName());
            }
        });
        sortOrder = !sortOrder;
    }

    public void sortByMark(ActionEvent actionEvent) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortOrder? o1.getMark() - o2.getMark() : o2.getMark() - o1.getMark();
            }
        });
        sortOrder = !sortOrder;
    }

    public void edit(MouseEvent mouseEvent) throws Exception{
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Confirmation");
        confirmAlert.setHeaderText("Are you sure you want to edit this student?");

        Optional<ButtonType> result = confirmAlert.showAndWait();
        if (result.get() == ButtonType.OK) {
            EditStudentController.editedStudent = studentLv.getSelectionModel().getSelectedItem();

            Parent addStudentPage = FXMLLoader.load(getClass().getResource("../editStudent/editStudent.fxml"));
            Scene sc = new Scene(addStudentPage, 400, 600);
            Main.rootStage.setTitle("Add student");
            Main.rootStage.setScene(sc);
        }
    }

}
