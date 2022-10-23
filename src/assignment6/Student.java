package assignment6;

public class Student {
    private String name;
    private String email;
    private int mark;

    public Student() {
    }

    public Student(String name, String email, int mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
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

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString() {
        return getName() + " - " + getEmail() + " - " + getMark();
    }
}
