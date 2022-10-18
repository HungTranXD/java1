package assignment4;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> tel;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        tel = new ArrayList<>();
        tel.add(phone);
    }
}
