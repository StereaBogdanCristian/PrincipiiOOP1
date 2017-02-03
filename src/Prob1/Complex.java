package Prob1;

public class Complex {

	private int r,i;
	
	public Complex () {
		r=0;
		i=0;
	}
	
	public Complex (int r, int i) {
		this.r = r;
		this.i = i;
	}

	public String toString() {
		return r + " + " + i + "i";
	}
	
	public boolean equals (Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Complex)) return false;
		Complex complex = (Complex) obj;
		return (complex.r == r && complex.i == i);
		
	}
	
	static Complex ad (Complex x, Complex y) {
		Complex temp = new Complex();
		temp.r = x.r + y.r;
		temp.i = x.i + y.i;
		return (temp);
	}
	
	static Complex inmultire (Complex x, Complex y) {
		Complex temp = new Complex();
		temp.r = (x.r*y.r) - (x.i*y.i);
		temp.i = (x.i*y.r) + (x.r*y.i);
		return temp;
	}
	
	static Complex laPutere (Complex x, int n) {
		Complex temp = new Complex();
		temp = x;
		for (int i = 1; i < n; i++) {
			temp = inmultire(temp, x);
		}
		return temp;
	}
}
