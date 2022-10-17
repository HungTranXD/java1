package assignment3;

public class Main {
    public static void main(String[] args) {
        ElectricityBill customer1 = new ElectricityBill(1, "Nguyen Van An", 12, 5, 2020, "Sinh hoat", 500);
        System.out.println("Thanh tien:" + customer1.paymentAmount());

        ElectricityBillForForeigner fCustomer1 = new ElectricityBillForForeigner(1, "John Henry", 12, 5, 2020, "UK", 500);
        System.out.println("Thanh tien:" + fCustomer1.paymentAmount());
    }
}
