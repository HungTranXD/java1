package assignment5;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class InputFormController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtTel;
    public Text strName;
    public Text strEmail;
    public Text strAddress;
    public Text strAge;
    public Text strTel;

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        int age = Integer.parseInt(txtAge.getText());
        String tel = txtTel.getText();

        strName.setText(name);
        strEmail.setText(email);
        strAddress.setText(address);
        strAge.setText(Integer.toString(age));
        strTel.setText(tel);
    }
}
