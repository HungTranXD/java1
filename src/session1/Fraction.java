package session1;

public class Fraction {
    /* Cac thuoc tinh: tu so (numerator) va mau so (denominator) */
    private int numerator, denominator;

    /* Constructor */
    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    /* Cac phuong thuc getter va setter */
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Invalid (zero) denominator.");
        } else {
            this.denominator = denominator;
        }
    }

    /*------------------------*/
    /* Phuong thuc in phan so */
    /*------------------------*/
    public void print() {
        if (numerator * denominator <= 0) {
            System.out.println("-" + Math.abs(numerator) + "/" + Math.abs(denominator));
        } else {
            System.out.println(Math.abs(numerator) + "/" + Math.abs(denominator));
        }
    }

    /*-----------------------------*/
    /* Phuong thuc rut gon phan so */
    /*-----------------------------*/
    public void reduce() {
        //Tim UCLN (thuật toán Ecculid)
        int a = numerator;
        int b = denominator;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        //Chia cả tử và mẫu cho UCLN
        this.numerator /= b;
        this.denominator /= b;
    }

    /*--------------------------------*/
    /* Phuong thuc nghich dao phan so */
    /*--------------------------------*/
    public void inverse() {
        if (numerator == 0) {
            throw new IllegalArgumentException("Fractions with numerator = 0 dont have inverse");
        } else {
            int temp = numerator;
            numerator = denominator;
            denominator = temp;
        }
    }

    /*----------------------------*/
    /* Phuong thuc cong 2 phan so */
    /*----------------------------*/
    public Fraction add(Fraction b)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * b.denominator + this.denominator * b.numerator;
        result.denominator = this.denominator * b.denominator;
        result.reduce();
        return result;
    }

    /*---------------------------*/
    /* Phuong thuc tru 2 phan so */
    /*---------------------------*/
    public Fraction subtract(Fraction b)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator * b.denominator - this.denominator * b.numerator;
        result.denominator = this.denominator * b.denominator;
        result.reduce();
        return result;
    }

    /*----------------------------*/
    /* Phuong thuc nhan 2 phan so */
    /*----------------------------*/
    public Fraction multiply(Fraction b)
    {
        Fraction result = new Fraction();
        result.numerator = this.numerator + b.numerator;
        result.denominator = this.denominator * b.denominator;
        result.reduce();
        return result;
    }

    /*----------------------------*/
    /* Phuong thuc chia 2 phan so */
    /*----------------------------*/
    public Fraction divide(Fraction b)
    {
        b.inverse();
        return this.multiply(b);
    }

}
