package assignment3;

public class ElectricityBillForVietnamese extends ElectricityBill{
    //Đối tượng (sinh hoạt, sản xuất..)
    private String cusType;

    //Constructor
    public ElectricityBillForVietnamese() {
    }
    public ElectricityBillForVietnamese(String code, String name, int day, int month, int year, int electricityConsumed, String cusType) {
        super(code, name, day, month, year, electricityConsumed);
        this.cusType = cusType;
    }

    //Getter and setter
    public String getCusType() {
        return cusType;
    }
    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    @Override
    public double paymentAmount() {
        return super.paymentAmount();
    }
}
