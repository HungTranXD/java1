package session5;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a/b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            //Dù có catch hay không vẫn chạy qua đây
        }
    }
}
