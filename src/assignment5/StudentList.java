package assignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentList {
    private ObservableList<StudentInfo> list = FXCollections.observableArrayList();

    public void addStudent(String name, String email, String address, int age, String tel) {
        for(StudentInfo ct: list) {
            if (ct.getName().equals(name)) {
                ct.setEmail(email);
                ct.setAddress(address);
                ct.setAge(age);
                ct.setTel(tel);
                return;
            }
        }
        list.add(new StudentInfo(name, email, address, age, tel));
    }

    public ObservableList<StudentInfo> getList() {
        return list;
    }
}
