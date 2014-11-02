package aufgabe6_Theoriefragen;

class MyException extends Exception {
	private static final long serialVersionUID = -6143702225896534442L;
}

class MySubException extends MyException {
	private static final long serialVersionUID = -6472371391262549291L;
}

@SuppressWarnings("unused")
public class ExceptionTheory {
	void test1(int x) throws Exception {
		try {
			if (x == 0) {
				throw new Exception();
			} else if (x == 1) {
				throw new MyException();
			} else if (x == 2) {
				throw new MySubException();
			}
		} catch (MySubException e) {
			System.out.println("First catch");
		} catch (MyException e) {
			System.out.println("Second catch");
		} finally {
			System.out.println("Finally");
		}
	}

	void test2(int x) {
		try {
			try {
				if (x == 0) {
					throw new MyException();
				} else {
					throw new MySubException();
				}
			} catch (MySubException s) {
				System.out.println("Inner");
			}
		} catch (MyException s) {
			System.out.println("Outer");
		}
	}

	void test3() throws Exception {
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println("First catch");
			throw e;
		} catch (Exception e) {
			System.out.println("Second catch");
			throw e;
		}
	}

	void test4() {
		try {
			throw new RuntimeException("Test");
		} finally {
			((String) null).length();
		}
	}

	void subCall1() throws RuntimeException {
	}

	void subCall2() throws MyException {
	}

	void test5() {
		subCall1();
	}

	void test6() throws MyException {
		subCall2();
	}

	public static void main(String[] args) throws Exception {
		ExceptionTheory t = new ExceptionTheory();
		a(t);
		// b(t);
		// c(t);
		// d(t);
		// e();
	}

	private static void a(ExceptionTheory t) throws Exception {
		// t.test1(0); // Finally
		t.test1(1); // Second catch, Finally
		t.test1(2); // First catch, Finally
	}

	private static void b(ExceptionTheory t) {
		t.test2(0); // Outer
		t.test2(1); // Innter
	}

	private static void c(ExceptionTheory t) throws Exception {
		t.test3(); // First catch
	}

	private static void d(ExceptionTheory t) {
		t.test4(); // NullPointerException
	}

	private static void e() {
		// test6 misses "throws MyException;
	}

}
