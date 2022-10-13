package session2;

import session1.Student;

public class Main {
    public static void main (String[] args) {
        Student t = new Student();
//        t.name = "";
        FptStudent f = new FptStudent();
        f.run();
        f.run(10);

        FptStudent f2 = new FptStudent("Sum");

        FptStudent f3 = new FptStudent("TH123", "Nguyen Van A", "09876554");
    }
}
