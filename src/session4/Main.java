package session4;

public class Main {
    public static void main(String[] args) {
        Vietnamese vn1 = new Vietnamese();
        vn1.eat();
        vn1.run();

        Human h = new Human() {
            @Override
            public void eat() {

            }

            @Override
            public void run() {

            }
        };

    }
}
