package assignment2;

import java.util.Calendar;
import java.util.Date;

public class ElectricityBill {
    //Ma khach hang
    private int id;
    //Ho ten
    private String name;
    //Ngay ra hoa don
    private int billDate = new Ca();
    //Doi tuong khach hang (sinh hoat, kinh doanh, san suat)
    private enum cusType {
        SinhHoat,
        KinhDoanh,
        SanXuat
    }
    //So luong (so KW tieu thu)
    private int electricityAmount;

    //CONSTRUCTOR
    public ElectricityBill() {
    }
    public ElectricityBill(int id, String name, Date billDate, int electricityAmount) {
        this.id = id;
        this.name = name;
        this.billDate = billDate;
        this.electricityAmount = electricityAmount;
    }

    //GETTER AND SETTER METHODS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public int getElectricityAmount() {
        return electricityAmount;
    }

    public void setElectricityAmount(int electricityAmount) {
        this.electricityAmount = electricityAmount;
    }

    //Phuong thuc tinh thanh tien
    public double CalcPaymentAmount() {
        double paymentAmount = 0;
        if(getElectricityAmount() < 50) {
            paymentAmount = (double) getElectricityAmount() * 1000;
        }
        if(getElectricityAmount() >=50 && getElectricityAmount() < 100) {
            paymentAmount = (double) 50 * 1000 + (getElectricityAmount() - 50) * 1200;
        }
        if(getElectricityAmount() >= 100 && getElectricityAmount() < 200) {
            paymentAmount = (double) 50 * 1000 + 50 * 1200 + (getElectricityAmount() - 100) * 1500;
        }
        if(getElectricityAmount() >= 200) {
            paymentAmount = (double) 50 * 1000 + 50 * 1200 + 100 * 1500 + (getElectricityAmount() - 200) * 2000;
        }
        return paymentAmount;
    }
}
