package session3;

import session2.FptStudent;

public class T2204MStudents extends FptStudent {
    public String address;

    public T2204MStudents() {
    }
    public T2204MStudents(String code, String name, String tel, String address) {
        super(code, name, tel);
        this.address = address;
    }
    @Override
    public void run(int x) {
        System.out.println("Run override");
    }

    @Override
    public void run() {
        super.run();

        super.run(12);
        this.run(12);

        System.out.println("Run A");
    }




}
