package generics;

class Generics_Test {

	public static void main(String[] args) {
		Generics<int> gen = new Generics<>(20, 40);
		System.out.println(gen.includes(22));
		
		
	}

}
