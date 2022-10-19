package assignment3;

import java.time.LocalDate;

public class ElectricityBill {
    //Ma khach hang
    private String code;
    //Ho ten
    private String name;
    //Ngay ra hoa don
    private int day;
    private int month;
    private int year;
    //Lượng điện tiêu thụ
    private int electricityConsumed;

    //CONSTRUCTOR
    public ElectricityBill() {
    }

    public ElectricityBill(String code, String name, int day, int month, int year, int electricityConsumed) {
        this.code = code;
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.electricityConsumed = electricityConsumed;
    }

    //GETTER AND SETTER METHODS
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getElectricityConsumed() {
        return electricityConsumed;
    }

    public void setElectricityConsumed(int electricityConsumed) {
        this.electricityConsumed = electricityConsumed;
    }

    //Phuong thuc tinh thanh tien
    public double paymentAmount() {
        if(getElectricityConsumed() < 50) {
            return (double) getElectricityConsumed() * 1000;
        } else if (getElectricityConsumed() < 100) {
            return (double) 50 * 1000 + (getElectricityConsumed() - 50) * 1200;
        } else if (getElectricityConsumed() < 200) {
            return (double) 50 * 1000 + 50 * 1200 + (getElectricityConsumed() - 100) * 1500;
        } else {
            return (double) 50 * 1000 + 50 * 1200 + 100 * 1500 + (getElectricityConsumed() - 200) * 2000;
        }
    }
}
