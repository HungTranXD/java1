package session2;

import java.util.ArrayList;

public class FptStudent {
    protected String code;
    protected String name;
    protected String tel;
    ArrayList<String> classes = new ArrayList<>();


    private int mark;
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    public FptStudent() {
        System.out.println("Fpt Student");
    }

    public FptStudent(String msg) {
        System.out.println("Fpt Student with massage");
    }
    //Ham khoi tao day du tham so (Chuot phai + generate)
    public FptStudent(String code, String name, String tel) {
        this.code = code;
        this.name = name;
        this.tel = tel;
    }

    public void run() {
        System.out.println("Run 1");
    }

    public void run(int x) {
        System.out.println("Run 2");
    }

    public void run(String x) {
        System.out.println("Run 3");
    }

    public void run(int x, String y) {
        System.out.println("Run 4");
    }

    public void run(String x, int y) {
        System.out.println("Run 5");
    }
}
