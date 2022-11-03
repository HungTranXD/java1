package exam;

public class ComplexDemo {
    public static void main(String[] args) {
        try {
            Complex a = new Complex(5, 6);
            Complex b = new Complex(-3, 4);
            //Display a and b;
            System.out.println("a = " + a.toString());
            System.out.println("b = " + b.toString());
            //Calculation
            System.out.println("a + b = " + a.add(b).toString());
            System.out.println("a - b = " + a.subtract(b).toString());
            System.out.println("a * b = " + a.multiply(b).toString());
            System.out.println("a / b = " + a.divide(b).toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
