package session3;

import session2.FptStudent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FptStudent[] fptStudents = new FptStudent[4];
        fptStudents[0] = new FptStudent();

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 12;

        fptStudents[0].run();

        //----- Array list khong gioi han so phan tu trong mang (khong dung voi kieu du lieu nguyen thuy) ----
        ArrayList<FptStudent> fArr = new ArrayList<>();
        fArr.add(new FptStudent());
        fArr.add(new FptStudent());

        fArr.get(0).run(); //khong viet fArr[0]

        //Duyet mang (chay vong lap)
        //Cach1:
        for(int i = 0; i < fArr.size(); i++) { //neu la mang thuong thi la fptStudents.length
            fArr.get(i).run("abc");
        }
        //Cach2:
        for(FptStudent fx: fArr) {
            fx.run("xyz"); //fx = fArr[i]
        }

        // ----- Muon lam viec voi kieu du lieu nguyen thuy dung class Wrapper (Integer, Float, Double)
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(10);




        // ------------ Inheritance -------------
        T2204MStudents ts = new T2204MStudents();
        ts.run();
        ts.setMark(5);
    }
}
