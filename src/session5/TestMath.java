package session5;

import java.time.Clock;

class Mathematics {
    public void divide(int num1, int num2) {
//        try {
//            System.out.println("Division is:" + num1/num2);
//        } catch (ArithmeticException e) {
//            System.out.println("Error:" + e.getMessage());
//        }
        if (num2 == 0) {
            throw new ArithmeticException("Error: divide by zero");
        } else {
            System.out.println("Division is:" + num1/num2);
        }
        System.out.println("Rest of the method.");
    }
}

public class TestMath {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 0;
            Mathematics m = new Mathematics();
            m.divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Clock defaultClock = Clock.systemUTC();
        System.out.println("Clock: " + defaultClock);

        Clock defaultClock2 = Clock.systemDefaultZone();
        System.out.println("Clock: " + defaultClock2);

    }

}
