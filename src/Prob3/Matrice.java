package Prob3;

public class Matrice {
	
	int [][] matrice;
	
//Constructor fara parametru
	public Matrice () {
		matrice = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrice [i][j] = 0;
			}
		}
	}
	
//Constructor cu parametru - dimensiunea matricei	
	public Matrice (int dim) {
		matrice = new int[dim][dim];
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				matrice [i][j] = 0;
			}
		}
	}
	
// Afisare, rescriere toString
	public String toString () {
		String temp ="";
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				temp = temp + matrice[i][j] + " ";
			}
			temp = temp + "\n";
		}
		return temp;
	}
	
// Populare matrice cu nr aleatoare de la 0 la 9. Metoda cu parametru
	public static void populareMatrice (Matrice m) {
		for (int i = 0; i < m.matrice.length; i++) {
			for (int j = 0; j < m.matrice.length; j++) {
				m.matrice[i][j] = (int)(Math.random() * 10);
			}
			
		}
	}

// Populare matrice cu nr aleatoare de la 0 la 9. Metoda ce returneaza noua matrice
	public Matrice popMatrice () {
		Matrice temp = new Matrice(matrice.length);
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				temp.matrice[i][j] = (int)(Math.random() * 10);
			}	
		}
		return temp;
	}
	
	public Matrice inmultire (Matrice m) {
		Matrice temp = new Matrice (matrice.length);
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				int val = 0;
				for (int k = 0; k < matrice.length; k++) {
					val = val + matrice[i][k] * m.matrice[k][j];
				}
				temp.matrice [i][j] = val;
			}
		}
		return temp;
	}
	
	public Matrice laPutere (int putere) {
		Matrice temp = new Matrice(matrice.length);
		temp.matrice = matrice;
		for (int i = 1; i < putere; i++) {
			temp = temp.inmultire(temp);
		}
		return temp;
	}
	
}
