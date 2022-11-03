package assignment3;

public class ElectricityBillForVietnamese extends ElectricityBill{
    enum CusType {SANXUAT, SINHHOAT};
    //Đối tượng (sinh hoạt, sản xuất..)
    private CusType cusType;

    //Constructor
    public ElectricityBillForVietnamese() {
    }
    public ElectricityBillForVietnamese(String code, String name, int day, int month, int year, int electricityConsumed, CusType cusType) {
        super(code, name, day, month, year, electricityConsumed);
        this.cusType = cusType;
    }

    //Getter and setter
    public CusType getCusType() {
        return cusType;
    }

    public void setCusType(CusType cusType) {
        this.cusType = cusType;
    }

    @Override
    public double paymentAmount() {
        return super.paymentAmount();
    }
}
