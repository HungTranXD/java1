package session1;

public class Triangle {
    int a, b, c;

    public Triangle() {
        System.out.println("Construcctor");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int findParameter() {
        return a + b + c;
    }
    public double findArea() {
        double p = (double) findParameter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
