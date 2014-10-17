import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;

public class Aufgabe3_InverserHexKonverter {

	public static void main(String[] args) {
		// TODO: implement
		ArrayList<Character> list = new ArrayList<Character>();
		System.out.print("Geben Sie eine HexZahl ein:\t");

		char c;
		final long HEX = 16;
		c = nextChar();
		while (c != '\n' && c != '\r') {
			list.add(0, c);
			c = nextChar();
		}

		int i = 0;
		int result = 0;
		for (char cInvert : list) {
			result += (int) Math.pow(HEX, i++) * convertCharToInt(cInvert);
		}
		System.out.println("\nDas ist die Eingegebene Hex-Zahl in Dezimal:\t"
				+ result);
	}

	// returns the next ASCII character of a console line input
	private static char nextChar() {
		try {
			return (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			return '\0';
		}
	}

	public static int convertCharToInt(char c) {
		if (c >= 49 && c <= 57) {
			return c - 48;
		} else if (c >= 65 && c <= 70) {
			return c - 55;
		} else if (c >= 97 && c <= 102) {
			return c - 87;
		} else {
			System.err.println("Die eingegeben Zahl ist keine HexZahl");
			System.exit(-1);
			return 0;
		}
	}
}