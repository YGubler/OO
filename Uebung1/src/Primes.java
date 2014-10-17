import java.util.Scanner;


public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Geben Sie eine Zahl ein, um zu prüfen ob sie eine Primzahl ist");
		int n = numFromConsole();
		System.out.println(ifPrime(n));

	}
	
	public static int numFromConsole(){
		Scanner numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		numFromConsole.close();
		return num;
		
	}
	
	public static boolean ifPrime(int n){
		if(n >= 2){
			for(int i = 2; i < n; i++){
				if(n%i == 0){
					return false;
				}
			}
		return true;
		}
		else{
			return false;
		}


		
	}

}
