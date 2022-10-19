package assignment3;

public class ElectricityBillForForeigner extends ElectricityBill{
    private String nationality;

    //Constructor
    public ElectricityBillForForeigner() {
    }
    public ElectricityBillForForeigner(String code, String name, int day, int month, int year, int electricityConsumed, String nationality) {
        super(code, name, day, month, year, electricityConsumed);
        this.nationality = nationality;
    }

    //Getter and setter
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public double paymentAmount() {
        return this.getElectricityConsumed() * 2000;
    }
}
