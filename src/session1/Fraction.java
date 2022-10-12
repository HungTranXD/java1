package session1;

public class Fraction {
    /*-----------------------------------------------------------*/
    /* Cac thuoc tinh: tu so (numerator) va mau so (denominator) */
    /*-----------------------------------------------------------*/
    private int numerator, denominator; //stores the fraction data

    /*----------------------------------*/
    /* Cac phuong thuc getter va setter */
    /*----------------------------------*/
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
    public String toString() {
        if (numerator * denominator <= 0) {
            return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);
        } else {
            return Math.abs(numerator) + "/" + Math.abs(denominator);
        }
    }

    /*-----------------------------*/
    /* Phuong thuc rut gon phan so */
    /*-----------------------------*/
    public Fraction reduce() {
        Fraction result = new Fraction();
        int common = 0;
        // get absolute values for numerator and denominator
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        // figure out which is less, numerator or denominator
        if (num > den)
            common = gcd(num, den);
        else if (num < den)
            common = gcd(den, num);
        else  // if both are the same, don't need to call gcd
            common = num;

        // set result based on common factor derived from gcd
        result.numerator = numerator / common;
        result.denominator = denominator / common;
        return result;
    }

    /*--------------------------------*/
    /* Phuong thuc nghich dao phan so */
    /*--------------------------------*/
    public Fraction inverse() {
        Fraction result = new Fraction();
        if (numerator == 0) {
            throw new IllegalArgumentException("Fractions with numerator = 0 dont have inverse");
        } else {
            result.numerator = denominator;
            result.denominator = numerator;
        }
        return result;
    }

    /*----------------------------*/
    /* Phuong thuc cong 2 phan so */
    /*----------------------------*/
    public Fraction add(Fraction b)
    {
        // find lowest common denominator
        int common = lcd(denominator, b.denominator);
        // convert fractions to lcd
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        // create new fraction to return as sum
        Fraction sum = new Fraction();
        // calculate sum
        sum.numerator = commonA.numerator + commonB.numerator;
        sum.denominator = common;
        // reduce the resulting fraction
        sum = sum.reduce();
        return sum;
    }

    /*---------------------------*/
    /* Phuong thuc tru 2 phan so */
    /*---------------------------*/
    public Fraction subtract(Fraction b)
    {
        // find lowest common denominator
        int common = lcd(denominator, b.denominator);
        // convert fractions to lcd
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = b.convert(common);
        // create new fraction to return as difference
        Fraction diff = new Fraction();
        // calculate difference
        diff.numerator = commonA.numerator - commonB.numerator;
        diff.denominator = common;
        // reduce the resulting fraction
        diff = diff.reduce();
        return diff;
    }

    /*----------------------------*/
    /* Phuong thuc nhan 2 phan so */
    /*----------------------------*/
    public Fraction multiply(Fraction b)
    {
        // create new fraction to return as product
        Fraction product = new Fraction();
        // calculate product
        product.numerator = numerator * b.numerator;
        product.denominator = denominator * b.denominator;
        // reduce the resulting fraction
        product = product.reduce();
        return product;
    }

    /*----------------------------*/
    /* Phuong thuc chia 2 phan so */
    /*----------------------------*/
    public Fraction divide(Fraction b)
    {
        // create new fraction to return as result
        Fraction result = new Fraction();
        // calculate result
        result.numerator = numerator * b.denominator;
        result.denominator = denominator * b.numerator;
        // reduce the resulting fraction
        result = result.reduce();
        return result;
    }






    /*---------------------------------------------------*/
    /* private methods used internally by Fraction class */
    /*---------------------------------------------------*/

    // 1. Find LCD (find lowest common denominator, used to add and subtract fractions)
    private int lcd(int denom1, int denom2)
    {
        int factor = denom1;
        while ((denom1 % denom2) != 0)
            denom1 += factor;
        return denom1;
    }
    // 2. Find GCD (find greatest common denominator, used to reduce fractions) - Eculid algorithm
    private int gcd(int denom1, int denom2)
    {
        int factor = denom2;
        while (denom2 != 0) {
            factor = denom2;
            denom2 = denom1 % denom2;
            denom1 = factor;
        }
        return denom1;
    }
    // 3. Convert (convert a fraction to an equivalent one based on a lowest common denominator)
    private Fraction convert(int common)
    {
        Fraction result = new Fraction();
        int factor = common / denominator;
        result.numerator = numerator * factor;
        result.denominator = common;
        return result;
    }

}
