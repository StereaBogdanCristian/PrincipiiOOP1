
package Prob3;

public class Problema3 {

	public static void main(String[] args) {
		
		Matrice m1 = new Matrice(2);
		Matrice m2 = new Matrice(2);
		Matrice inmultire = new Matrice(2);
		
		Matrice.populareMatrice(m1);
		System.out.println(m1);
		//m2 = m2.popMatrice();
		//System.out.println(m2);
		
		//inmultire = m1.inmultire(m2);
		//System.out.println(inmultire);
		
		System.out.println(m1.inmultire(m1));
		
		System.out.println(m1 + "******");
		m1 = m1.laPutere(2);
		System.out.println(m1);
		
	
	}
}
