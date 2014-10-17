
public class Aufgabe5Overloading {


	public static int calculate(int i){
		System.out.println("1");
		return 0;
	}
	
	public static float calculate(int x, float y){
		System.out.println("2");
		return 0;
	}
	
	public static float calculate(float x, int y){
		System.out.println("3");
		return 0;
	}
	
	public static double calculate(double x, double y){
		System.out.println("4");
		return 0;
	}
	
	public static void main(String[] args) {

//		int a = calculate(2.0);
		float b = calculate(1, 2.0f);
//		float c = calculate(1, 2);
		double d = calculate(1.0f, 2.0f);
		double e = calculate(1.0, 2.0f);
		double f = calculate(1L, 2); 
	}

}
