package aufgabe2_LimitierteAnzahlVersuche;


import java.util.Scanner;

public class Divider {
	public static void main(String[] args) throws InvalidUserInterupt {
		Scanner scanner = new Scanner(System.in);
		String line;
		int i = 0;
		do {
			System.out.println("Enter numerator: ");
			int numerator = scanner.nextInt();
			System.out.println("Enter divider: ");
			int divider = scanner.nextInt();
			try {
				int div = numerator / divider;
				System.out.printf("%d/%d == %d\n", numerator, divider, div);
			} catch (ArithmeticException e){
				if (i > 2) {
					scanner.close();
					throw new InvalidUserInterupt();
				}
				i++;
				e.printStackTrace();
				System.out.println("Div mit Null undefiniert");
			}
			System.out.println("Stop?");
			line = scanner.next();
		} while (!line.equals("yes"));
		scanner.close();
	}
}
