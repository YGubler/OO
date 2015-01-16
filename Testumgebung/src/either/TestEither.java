package either;

class TestEither {

	public static void main(String[] args) {
		int i = 2, j = 0;
		// System.out.println("1. Zahl:\t" + i + "\n2.Zahl:\t" + j + "\n");
		Either<Integer, String> r1 = div(2, 1);
		Either<Integer, String> r2 = div(2, 1);
		System.out.println(r1.equals(r2));
		if (r1 instanceof Left<?, ?>) {
			System.out.println(((Left<Integer, String>) r1).get());
		} else if (r1 instanceof Right<?, ?>) {
			System.out.println(((Right<Integer, String>) r1).get());
		}

	}

	public static Either<Integer, String> div(int i, int j) {
		if (j == 0) {
			return new Right<Integer, String>("Fehler");
		} else {
			return new Left<Integer, String>(i / j);
		}
	}

}
