public class Complex {

  private double re, im;

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public Complex ajouteToi(Complex c) {
    this.re += c.re;
    this.im += c.im;
    return this;
  }

  public Complex add(Complex c) {
    Complex resultat = new Complex(c.re + this.re, c.im + this.im);
    return resultat;
  }

  public Complex multiplieParToi(Complex c) {
    this.re = this.re * c.re - this.im * c.im;
    this.im = this.re * c.im + this.im * c.re;
    return this;
  }

  public Complex mul(Complex c) {
    Complex resultat = new Complex(
      this.re * c.re - this.im * c.im,
      this.re * c.im + this.im * c.re
    );
    return resultat;
  }

  public Complex opposeToi() {
    this.re = -this.re; 
    this.im = -this.im;
    return this;
  }

  public Complex oppose() {
    Complex resultat = new Complex(-this.re, -this.im);
    return resultat;
  }

  public double calculeModule(Complex c) {
    double resultat = Math.sqrt(this.re * this.re + this.im * this.im);
    return resultat;
  }

  public double getRe() {
    return this.re;
  }

  public double getIm() {
    return this.im;
  }

  public String toString() {
    return this.re + " , " + this.im;
  }
}
