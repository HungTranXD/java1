package assignment3;

public class ElectricityBillForForeigner extends ElectricityBill{
    private String nationality;

    public ElectricityBillForForeigner() {
    }

    //Viet constructor do khach hang nuoc ngoai khong co "doi tuong khach hang" (sinh hoat, san xuat...)
    public ElectricityBillForForeigner(int id, String name, int day, int month, int year, String nationality, int electricityConsumed) {
        this.setId(id);
        this.setName(name);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.nationality = nationality;
        this.setElectricityConsumed(electricityConsumed);
    }

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
