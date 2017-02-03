package Prob4;

public class Problema4 {
	
	public static void main(String[] args) {
		
		InSet vector = new InSet(10);
		
		for (int i = 0; i < 15; i++) {
			vector.addInt((int)(Math.random()*21));
		}
		
		System.out.println(vector);
		
		System.out.println("Vectorul contine valoarea 5 " + vector.contains(5));
		System.out.println("Vectorul contine valoarea 7 " + vector.contains(7));
		System.out.println("Vectorul contine valoarea 14 " + vector.contains(14));
	}
}
