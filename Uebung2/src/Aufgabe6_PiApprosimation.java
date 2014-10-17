
public class Aufgabe6_PiApprosimation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 2.0;
		double temp = Math.sqrt(2.0);
		final double EPS = 10E-8;
	
		
		for(int i = 0; i <= 1000; i++){
			pi *= 2 / temp;
			temp = Math.sqrt(2.0 + temp);
			
			if(Math.abs(pi - Math.PI) < EPS){
				System.out.println("Es brauchte " + i + " Durchläufe bis Pi auf 8 Stellen genau war.");
				break;
			}
		}
		System.out.println(pi);

	}

}
