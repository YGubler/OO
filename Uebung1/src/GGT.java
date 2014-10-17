import java.util.Scanner;


public class GGT {

	private static Scanner numFromConsole;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Geben Sie die erste Zahl ein: ");
		int zahl1 = numFromConsole();
		System.out.println("Geben Sie die zweite Zahl ein:");
		int zahl2 = numFromConsole();
		
		System.out.println(ggt(zahl1, zahl2) + " Dies ist der grösste gemeinsame Teiler");
		

	}

	
	public static int numFromConsole(){
		numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		return num;		
	}
	
	public static int ggt(int zahl1, int zahl2){
		while (zahl2 != 0){
			if (zahl1 > zahl2){
				zahl1 = zahl1 -zahl2;
			}
			else {
				zahl2 = zahl2 - zahl1;
			}
		}
		return zahl1;
	}
}
