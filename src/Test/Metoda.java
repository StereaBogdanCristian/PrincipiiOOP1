package Test;

public class Metoda {
	static void metoda(String sir, int n) {
		sir = "abc";
		System.out.println(sir + "        abc  1");
		n=123;
		sir.replace('a', 'X');
		System.out.println(sir + "      X  2");
	}
}
