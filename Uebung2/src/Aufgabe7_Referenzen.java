class Coordinate {
	 int x = 0;
	 int y = 0;
}
	
public class Aufgabe7_Referenzen {
	public static void main( String[] args ) {
		Coordinate a = new Coordinate();
		a.x = 1; a.y = 1;
		Coordinate b = new Coordinate();
		b.x = 2; b.y = 2;
		Coordinate c = b;
		System.out.println( "Initialization" );
		System.out.println( "=========" );
		System.out.println( "a: " + a.x + " " + a.y); 	// Output: a: 1 1____________
		System.out.println( "b: " + b.x + " " + b.y); 	// Output: b: 2 2____________
		System.out.println( "c: " + c.x + " " + c.y); 	// Output: c: 2 2____________
		System.out.println( "" );
		a.x = 10; a.y = 10;
		System.out.println("a.x = 10; a.y = 10;");
		System.out.println("==============");
		System.out.println("a: " + a.x + " " + a.y); 	// Output: a: 10 10____________
		System.out.println("b: " + b.x + " " + b.y); 	// Output: b: 2 2____________
		System.out.println("c: " + c.x + " " + c.y); 	// Output: c: 2 2____________
		System.out.println();
		c.y = 20; 
		System.out.println("c.y = 20;");
		System.out.println("==============");
		System.out.println("a: " + a.x + " " + a.y); 	// Output: a: 10 10____________
		System.out.println("b: " + b.x + " " + b.y); 	// Output: b: 2 20____________
		System.out.println("c: " + c.x + " " + c.y); 	// Output: c: 2 20____________
		System.out.println();
		b = a;
		System.out.println("b = a;");
		System.out.println("==============");
		System.out.println("a: " + a.x + " " + a.y); 	// Output: 10 10____________
		System.out.println("b: " + b.x + " " + b.y); 	// Output: 10 10____________
		System.out.println("c: " + c.x + " " + c.y); 	// Output: 2 20____________
		System.out.println();
		a = new Coordinate();
		System.out.println("a = new Coordinate;");
		System.out.println("==============");
		System.out.println("a: " + a.x + " " + a.y); 	// Output: a: 0 0____________
		System.out.println("b: " + b.x + " " + b.y); 	// Output: b: 10 10____________
		System.out.println("c: " + c.x + " " + c.y); 	// Output: c: 2 20____________
		System.out.println();
		c = null;
		System.out.println("c = null;");
		System.out.println( "===========" );
		System.out.println("==============");
		System.out.println("a: " + a.x + " " + a.y); 	// Output: a: 0 0____________
		System.out.println("b: " + b.x + " " + b.y); 	// Output: b: 10 10____________
		System.out.println("c: " + c.x + " " + c.y); 	// Output: c: NullPointerException____________
		System.out.println();
	}
}

