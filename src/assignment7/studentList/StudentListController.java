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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.ResourceBundle;


public class StudentListController implements Initializable {
    public ListView<Student> studentLv;
    public TableView<Student> tbStudents;
    public TableColumn<Student, String> cName;
    public TableColumn<Student, String> cEmail;
    public TableColumn<Student, Integer> cMark;
    public TableColumn<Student, String> cGender;
    public TableColumn<Student, Button> cAction;

    private boolean sortOrder = true;

    public static ObservableList<Student> studentList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        cMark.setCellValueFactory(new PropertyValueFactory<>("mark"));
        cGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        cAction.setCellValueFactory(new PropertyValueFactory<>("edit"));

        if(studentList.size() == 0) {
            studentList.add(new Student("John", "john@gmail.com", 2, "male"));
            studentList.add(new Student("Emma", "emma@gmail.com", 3, "female"));
        }
        tbStudents.setItems(studentList);
    }

    public void goToAddPage(ActionEvent actionEvent) throws Exception{
        Parent addStudentPage = FXMLLoader.load(getClass().getResource("../addStudent/addStudent.fxml"));
        Scene sc = new Scene(addStudentPage, 600, 600);
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

    public void edit(MouseEvent mouseEvent){
        try {
            if(tbStudents.getSelectionModel().getSelectedItem() == null) {
                throw new Exception("No student selected");
            }
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmAlert.setTitle("Confirmation");
            confirmAlert.setHeaderText("Are you sure you want to edit this student?");

            Optional<ButtonType> result = confirmAlert.showAndWait();
            if (result.get() == ButtonType.OK) {
                EditStudentController.editedStudent = tbStudents.getSelectionModel().getSelectedItem();

                Parent addStudentPage = FXMLLoader.load(getClass().getResource("../editStudent/editStudent.fxml"));
                Scene sc = new Scene(addStudentPage, 600, 600);
                Main.rootStage.setTitle("Add student");
                Main.rootStage.setScene(sc);
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }

}
