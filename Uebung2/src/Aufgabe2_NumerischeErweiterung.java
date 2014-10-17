public class Aufgabe2_NumerischeErweiterung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		long l = 2;
		float f = .1f;
		double d = 0.2;

		// a)
		float x1 = (float) i / 4;
		System.out.println("a) " + x1);

		// b)
		double x2 = i / 4.0;
		System.out.println("b) " + x2);

		// c)
		float x3 = 1.0f / l;
		System.out.println("c) " + x3);

		// d)
		double y1 = 123456789 + f;
		System.out.println("d) " + y1);

		// e)
		double y2 = 123456789.0 + f;
		System.out.println("e) " + y2);

		// f)
		long z1 = Integer.MAX_VALUE + i;
		System.out.println("f) " + z1);

		// g)
		long z2 = Integer.MAX_VALUE * 2;
		System.out.println("g) " + z2);

		// h)
		float z3 = i / 0;
		System.out.println("h) " + z3);
	}

}
