package Test;

public class StringTest {
	public static void main(String[] args) {
		String s = new String();
		s = "az";
		int n=6;
		StringBuffer sb = new StringBuffer();
		sb.append("123");
		System.out.println(sb);
		sb.append("56");
		System.out.println(sb);
		
		Metoda.metoda(s, n);
		
		System.out.println(s + "   3   " + n);
		
		s = s.replace("a" ,"X");
		System.out.println(s + "      X  4");
	}
}
