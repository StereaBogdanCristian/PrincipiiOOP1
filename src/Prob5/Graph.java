package Prob5;

public class Graph {
	
	private boolean [][] matrice;
	
	public Graph (int nrNoduri) {
		matrice = new boolean [nrNoduri][nrNoduri];
	}
	

	void addArc (int x, int y) {
		matrice [x-1][y-1] = true;
	}
	
	
	boolean isArc (int x, int y) {
		return matrice[x-1][y-1];
	}
	
	
	void print () {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice.length; j++) {
				if (matrice[i][j]) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	public void dfs(int v, boolean vazut[]) {
		int w;
		vazut[v] = true;
		for (w = 1; w <= matrice.length; w++)
			if (isArc(v, w) && !vazut[w]) {
				System.out.println (v + " - " + w);
				dfs (w,vazut);
				}
	}
}

