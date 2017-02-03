package Prob1;

public class Problema1 {
	
	public static void main(String[] args) {
		
		Complex nr1 = new Complex(1,2);
		Complex nr2 = new Complex(1,2);
		Complex nr3 = new Complex();
		
		System.out.println(nr3);
		
		nr3 = Complex.ad(nr1, nr2);
		
		System.out.println(nr3);
		
		System.out.println(nr1.equals(nr2));
		
		System.out.println(Complex.inmultire(nr1, Complex.inmultire(nr1, nr1)));
		
		System.out.println(Complex.laPutere(nr1, 3));
		
	}
}
