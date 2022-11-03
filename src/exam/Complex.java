package exam;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    /* ------------------------------------------------------------- */
    /* ------------------------ Constructor ------------------------ */
    /* ------------------------------------------------------------- */
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /* ------------------------------------------------------------- */
    /* --------------------- Getter and setter --------------------- */
    /* ------------------------------------------------------------- */
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    /* ------------------------------------------------------------- */
    /* ----------------------- Other methods ----------------------- */
    /* ------------------------------------------------------------- */
    public Complex add(Complex b) {
        return new Complex(this.getRealPart() + b.getRealPart(), this.getImaginaryPart() + b.getImaginaryPart());
    }

    public Complex subtract(Complex b) {
        return new Complex(this.getRealPart() - b.getRealPart(), this.getImaginaryPart() - b.getImaginaryPart());
    }

    public Complex multiply(Complex b) {
        return new Complex(this.getRealPart() * b.getRealPart() - this.getImaginaryPart() * b.getImaginaryPart(), this.getRealPart() * b.getImaginaryPart() + this.getImaginaryPart() * b.getRealPart());
    }

    public Complex divide(Complex b) throws Exception{
        if (b.getRealPart() == 0 && b.getImaginaryPart() == 0) throw new Exception("Divide by zero");
        return new Complex( (this.getRealPart()*b.getRealPart() + this.getImaginaryPart()*b.getImaginaryPart()) / (b.getRealPart()*b.getRealPart() + b.getImaginaryPart()*b.getImaginaryPart()), (this.getImaginaryPart()*b.getRealPart() - this.getRealPart()*b.getImaginaryPart()) / (b.getRealPart()*b.getRealPart() + b.getImaginaryPart()*b.getImaginaryPart()));
    }

    public String toString() {
        if (getImaginaryPart() == 0) return getRealPart() + "";
        if (getRealPart() == 0) return getImaginaryPart() + "i";
        if (getImaginaryPart() < 0) return getRealPart() + " - " + (-getImaginaryPart()) + "i";
        return getRealPart() + " + " + getImaginaryPart() + "i";
    }
}
