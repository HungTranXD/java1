package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 22;

        s.showInfo();
        s2.showInfo();

        Scanner sc = new Scanner(System.in);
        Triangle t1 = new Triangle();
        System.out.println("Nhap canh 1:");
        t1.setA(sc.nextInt());
        System.out.println("Nhap canh 2:");
        t1.setB(sc.nextInt());
        System.out.println("Nhap canh 3:");
        t1.setC(sc.nextInt());
        System.out.println("Parameter: " + t1.findParameter());
        System.out.println("Area: " + t1.findArea());
    }
}
