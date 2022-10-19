package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.name = "Nam";
//        s.age = 18;
//
//        Student s2 = new Student();
//        s2.age = 22;
//
//        s.showInfo();
//        s2.showInfo();
//
//        Scanner sc = new Scanner(System.in);
//        Triangle t1 = new Triangle();
//        System.out.println("Nhap canh 1:");
//        t1.setA(sc.nextInt());
//        System.out.println("Nhap canh 2:");
//        t1.setB(sc.nextInt());
//        System.out.println("Nhap canh 3:");
//        t1.setC(sc.nextInt());
//        System.out.println("Parameter: " + t1.findParameter());
//        System.out.println("Area: " + t1.findArea());

        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction();
        System.out.println("Nhap tu so:");
        f1.setNumerator(sc.nextInt());
        System.out.println("Nhap mau so:");
        f1.setDenominator(sc.nextInt());
        f1.print();
        f1.reduce();
        f1.inverse();

        Fraction f2 = new Fraction();
        System.out.println("Nhap tu so:");
        f2.setNumerator(sc.nextInt());
        System.out.println("Nhap mau so:");
        f2.setDenominator(sc.nextInt());

        System.out.println("Ket qua phep cong: " + f1.add(f2));
        System.out.println("Ket qua phep tru: " + f1.subtract(f2));
        System.out.println("Ket qua phep nhan: " + f1.multiply(f2));
        System.out.println("Ket qua phep chia: " + f1.divide(f2));
    }
}
