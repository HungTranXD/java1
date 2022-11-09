package assignment7;

import assignment7.editStudent.EditStudentController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer mark;
    private String gender;
    private Button edit;

    public Student() {
    }

    public Student(Integer id, String name, String email, Integer mark, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mark = mark;
        this.gender = gender;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try {
                Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
                confirmAlert.setTitle("Confirmation");
                confirmAlert.setHeaderText("Are you sure you want to edit this student?");

                Optional<ButtonType> result = confirmAlert.showAndWait();
                if (result.get() == ButtonType.OK) {
                    EditStudentController.editedStudent = this;

                    Parent addStudentPage = FXMLLoader.load(getClass().getResource("editStudent/editStudent.fxml"));
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
        });
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    @Override
    public String toString() {
        return getName() + " - " + getEmail() + " - " + getMark() + " - " + getGender();
    }
}
