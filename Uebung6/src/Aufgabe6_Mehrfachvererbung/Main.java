package Aufgabe6_Mehrfachvererbung;

public class Main {

	public static void main(String[] args) {
		new C().a();
		new C().b();
	}

	interface A {
		int x = 5, y = 100;

		default void a() {
			System.out.println("A");
			System.out.println(x * y);
		}
	}

	interface B {
		default void b() {
			System.out.println("B");
		}
	}

	static class AB implements A, B {

	}

	static class C extends AB {

	}
}
