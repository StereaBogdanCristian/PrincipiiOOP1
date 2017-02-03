
package Prob4;

import java.util.Arrays;

public class InSet {
	int [] multime;
	int nrElem;
	
	public InSet (int dimMultime) {
		multime = new int [dimMultime];
		nrElem = 0;
	}
	

	public void addInt (int elemNou) {
		boolean valideaza = true;
		for (int i = 0; i < multime.length; i++) {
			if (multime [i] == elemNou) valideaza = false;
		}
		if (nrElem >= multime.length) System.out.println("Vectorul este plin");
		if (valideaza && (nrElem < multime.length)) {
			multime [nrElem] = elemNou;
			nrElem = nrElem + 1;
		}
	}
	
	public boolean contains (int elem) {
		boolean temp = false;
		for (int i = 0; i < multime.length; i++) {
			if (multime[i] == elem) temp = true;
		}
		return temp;
	}
	 
	public String toString () {
		return Arrays.toString(multime);
	}
}
