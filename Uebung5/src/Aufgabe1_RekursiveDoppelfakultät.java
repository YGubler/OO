import java.util.Scanner;

public class Aufgabe1_RekursiveDoppelfakultät {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Geben Sie die Fakultät ein.");
		int n = numFromConsole();

		System.out.println(doubleFactorial(n));

	}

	public static int doubleFactorial(int n) {
		if (n <= 1){
			return 1;
		}
		else{
			System.out.print(n + " * ");
			return n * doubleFactorial(n - 2);
		}

	}

	public static int numFromConsole() {
		Scanner numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		numFromConsole.close();
		return num;

	}

}