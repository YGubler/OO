import java.util.Scanner;


public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x: ");
		x = scanner.nextInt();
		System.out.println("Enter y: ");
		y = scanner.nextInt();
	
		// TODO: implement here
		
		if (x < y){
			System.out.println(y + " ist die grössere Zahl " + x + " die kleinere");
		}
		else if (x > y){
			System.out.println(x + " ist die grössere Zahl " + y + " die kleinrere");
		}
		else{
			System.out.println(x + " und " + y + " sind gleich gross");
		}
		scanner.close();
	}
}
