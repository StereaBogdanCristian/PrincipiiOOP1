package Prob2;

public class Stiva {
	
	private int[] stiva;
	private int nrElem;
	
	
	public Stiva () {
		stiva = new int[10];
		nrElem = 0;
	}
	
	
	public Stiva (int dimStiva) {
		stiva = new int[dimStiva];
		nrElem = 0;
	}
	
	
	void push (int n) {
		if (nrElem < stiva.length) {
			stiva[nrElem] = n;
			nrElem = nrElem + 1;
		}
		else System.out.println("stiva este plina");
	}

	
	int pop () {
		if (nrElem > 0) {
			stiva[nrElem-1] = 0;
			return nrElem-1;
		}
		else {
			System.out.println("stiva este goala");
			return 0;
		}
	}
	
	
	boolean isEmpty () {
		if (nrElem == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void afiseaza () {
		for (int i = 0; i < nrElem; i++) {
			System.out.print(stiva[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stiva stiva = new Stiva();
		
		System.out.println(stiva.isEmpty());
		stiva.push(1);
		stiva.push(7);
		stiva.push(3);
		stiva.push(9);
		System.out.println(stiva.isEmpty());
		stiva.afiseaza();
		stiva.nrElem = stiva.pop();
		stiva.nrElem = stiva.pop();
		stiva.afiseaza();
		stiva.nrElem = stiva.pop();
		stiva.nrElem = stiva.pop();
		stiva.nrElem = stiva.pop();
	}
}
