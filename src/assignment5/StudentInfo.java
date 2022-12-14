package assignment5;

public class StudentInfo {
    private String name;
    private String email;
    private String address;
    private int age;
    private String tel;

    public StudentInfo() {
    }

    public StudentInfo(String name, String email, String address, int age, String tel) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.tel = tel;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return name + "--" + email + "--" + address + "--" + age + "--" + tel;
    }
}
