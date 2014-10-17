import java.util.Scanner;

public class Aufgabe5_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Anzahl Werte von Fibonacci eingeben:");
		long x = numFromConsole();

		// Fibonacci rechnen
		if (x == 1) {
			System.out.println(1);
		} else if (x == 0) {
			System.out.println(0);
		} else if (x > 1) {

			// erste beiden Zahlen
			long a = 1;
			System.out.println(a);
			long b = 1;
			System.out.println(b);

			for (int i = 3; i <= x; ++i) {
				long c = a + b;
				if (c < 0) {
					System.err.println("Überlauf");
					break;
				}
				System.out.println(c);
				a = b;
				b = c;
			}
		} else {
			System.err.println("Ungültige Eingabe");
		}
	}

	// Read Number from Console
	public static long numFromConsole() {
		Scanner num = new Scanner(System.in);
		long x = num.nextLong();
		num.close();
		return x;

	}

}
