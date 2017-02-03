package Prob5;

public class Problema5 {
	
	public static void main(String[] args) {
		
		Graph g = new Graph(5);
		
		g.addArc(1, 3);
		g.addArc(1, 4);
		g.addArc(3, 4);
		g.addArc(2, 5);
		g.addArc(3, 5);
		
		g.print();
		
		System.out.println(g.isArc(2, 5));
		
	}

}
