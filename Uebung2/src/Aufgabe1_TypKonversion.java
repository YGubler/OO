public class Aufgabe1_TypKonversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = '!';
		byte b = 0;
		short s = 1;
		int i = 3;
		long l = 4;
		float f = .5f;
		double d = 0.6;

		// a)
		long z = b;
		System.out.println(z);

		// b)
		int a = (int) f * 2;
		System.out.println(a);

		// c)
		float x = 0x12345678;
		System.out.println(x);

		// d)
		double y = l * l;
		System.out.println(y);

		// e)
		z = (long) y * (long) y;
		System.out.println(z);

		// f
		s = (short) (b + 1);
		System.out.println(s);

		// g)
		b = (byte) (c + 1);
		System.out.println(b);

		// h)
		b += 1;
		System.out.println(b);
	}

}
