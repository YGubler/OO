package stringVergleich;

class StringVergleich {

	public static void main(String[] args) {
		String s1 = "Hallo";
		String s2 = "Hallo";
		System.out.println(s1 == s2);
		s2 = "Hallo 2";
		System.out.println(s1 == s2);
		s2 = "Hallo";
		System.out.println(s1 == s2);
		
		System.out.println(new String("Hallo") == new String("Hallo"));

	}

}
