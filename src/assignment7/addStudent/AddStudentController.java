package assignment7.addStudent;

import assignment7.Main;
import assignment7.Student;
import assignment7.studentList.StudentListController;
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
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import java.sql.*;

public class AddStudentController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public ComboBox<String> cbGender;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> genders = FXCollections.observableArrayList();
        genders.addAll("Male", "Female", "Other");
        cbGender.setItems(genders);
    }

    public void backToListPage(ActionEvent actionEvent) throws Exception{
        Parent addStudentPage = FXMLLoader.load(getClass().getResource("../studentList/studentList.fxml"));
        Scene sc = new Scene(addStudentPage, 600, 600);
        Main.rootStage.setTitle("Student list");
        Main.rootStage.setScene(sc);
    }

//    private void addStudent(String name, String email, Integer mark, String gender) throws Exception{
//        for (assignment7.Student s: StudentListController.studentList) {
//            if (s.getName().equals(name)) {
//                throw new Exception("Name already exists");
//            }
//        }
//        StudentListController.studentList.add(new Student(null, name, email, mark, gender));
//    }
    public void submit(ActionEvent actionEvent) throws Exception{
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            Integer mark = Integer.parseInt(txtMark.getText());
            if(mark < 0 || mark > 10) throw new Exception("Invalid mark");
            String gender = cbGender.getValue();

//            addStudent(name, email, mark, gender);

            //Add student to database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(StudentListController.connectionString, StudentListController.user, StudentListController.pwd);
            Statement stt = conn.createStatement();
            String sql_txt = "INSERT INTO students(name, email, mark, gender) VALUES ('" + txtName.getText() + "','" + txtEmail.getText() + "','" + txtMark.getText() + "','" + cbGender.getValue() + "')" ;
            stt.execute(sql_txt);

            backToListPage(null);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
