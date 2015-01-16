package auswertung;

class Auswertung {

	public static void main(String[] args) {
		int x = 1;
		int y = x++ + --x;
		
		System.out.println("x = " + x + "\ny = " + y);
		
		int a = 1;
		int b = a++ + ++a;
		System.out.println("a = " + a + "\nb = " + b);
		
		int c = 1;
		int d = c-- - --c;
		System.out.println("c = " + c + "\nd = " + d);

	}

}
