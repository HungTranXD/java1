package javafx;

public class Contact {
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + "--" + email;
    }
}
