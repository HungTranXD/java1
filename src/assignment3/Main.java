package assignment3;

public class Main {
    public static void main(String[] args) {
        ElectricityBillForVietnamese customer1 = new ElectricityBillForVietnamese("KH001", "Nguyen Van An", 12, 5, 2020, 500, ElectricityBillForVietnamese.CusType.SINHHOAT);
        System.out.println("Thanh tien:" + customer1.paymentAmount());

        ElectricityBillForForeigner fCustomer1 = new ElectricityBillForForeigner("KHNN001", "John Henry", 12, 5, 2020, 500,"UK");
        System.out.println("Thanh tien:" + fCustomer1.paymentAmount());
    }
}
