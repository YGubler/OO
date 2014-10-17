import java.util.Scanner;


public class DoubleFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Geben Sie die Fakultät ein.");
		int n = numFromConsole();
		
		
		System.out.println(doubleFactorial(n));
		
		
		
	}
	
	public static int doubleFactorial(int n){
		int product = 1;
		for (int i = (n % 2) + 2; i <= n; i+=2){
			product = product * i;
		}
		return product;
	}
	
	public static int numFromConsole(){
		Scanner numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		numFromConsole.close();
		return num;
		
	}
	

}
