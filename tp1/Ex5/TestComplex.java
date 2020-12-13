public class TestComplex {
  public static void main(String[] args) {
    Complex z1 = new Complex(1, 2);
    Complex z2 = new Complex(3, -5);
    Complex z3 = new Complex(1, 1);
    Complex z4 = new Complex(1, 0);

    System.out.println(z1);
    System.out.println(z2);
    System.out.println(z3);

    Complex z5 = z1.ajouteToi(z2.opposeToi());
    Complex z6 = z3.ajouteToi(z4.opposeToi());
    Complex z7 = z5.multiplieParToi(z6);

    System.out.println(z7);

    Complex z8 = z1.ajouteToi(z2.opposeToi());
    Complex z9 = z1.ajouteToi(z2).ajouteToi(z4.opposeToi());
    Complex z10 = z8.multiplieParToi(z9);

    System.out.println(z10);

    z1 = new Complex(1, 2);
    z2 = new Complex(3, -5);
    z3 = new Complex(1, 1);
    z4 = new Complex(1, 0);

    Complex z11 = z1.add(z2.oppose());
    Complex z12 = z1.add(z2).add(z4.oppose());
    Complex z13 = z11.mul(z12);

    System.out.println(z13);
  }
}
