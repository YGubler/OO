import java.util.Scanner;


public class EuclidGCD {

	private static Scanner numFromConsole;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Geben Sie die erste Zahl ein: ");
		int x = numFromConsole();
		System.out.println("Geben Sie die zweite Zahl ein:");
		int y = numFromConsole();
		
		System.out.println(ggt(x, y) + " Dies ist der gr�sste gemeinsame Teiler");
		
	}

	
	public static int numFromConsole(){
		numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		return num;		
	}
	
	public static int ggt(int x, int y){
		while (y != 0){
			int t = y;
			y = x % y;
			x = t;
		}
		return x;
					
		
	}
}
