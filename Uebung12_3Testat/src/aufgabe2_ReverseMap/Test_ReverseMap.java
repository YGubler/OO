package aufgabe2_ReverseMap;

import java.util.Iterator;

class Test_ReverseMap {

	public static void main(String[] args) {

		ReverseMap<Integer, String> map = new ReverseMap<Integer, String>();
		map.put(123456, "Hans Meier");
		map.put(333999, "Clara Müller");
		map.put(3339399, "Clara sMüller");
		map.put(9999, "Yanick Gubler");
		String name = map.getRight(123456); // returns “Hans Meier”
		int number = map.getLeft("Clara Müller"); // returns 333999

		System.out.println(name);
		System.out.println(number);

		System.out.println("\nGet all on the Right Side");
		int i = 0;
		Iterator<String> rights = map.rightValues();
		while (rights.hasNext()) {
			String elem = rights.next();
			System.out.println(++i + ". right: " + elem);
			if (elem.equals("Hans Meier")) {
				rights.remove();
			}
		}

		System.out.println("\nGet all on the Left Side");
		int j = 0;
		Iterator<Integer> lefts = map.leftValues();
		while (lefts.hasNext()) {
			Integer elem = lefts.next();
			System.out.println(++j + ". left: " + elem);
			if (elem.equals(333999)) {
				lefts.remove();
			}
		}

		System.out.println("\n333999 aus der einen und \"Hans Meier\" aus der anderen Map gelöscht");

		System.out.println("\nGet all on the Right Side");
		i = 0;
		Iterator<String> rightss = map.rightValues();
		while (rightss.hasNext()) {
			System.out.println(++i + ". right: " + rightss.next());
		}

		System.out.println("\nGet all on the Left Side");
		j = 0;
		Iterator<Integer> leftss = map.leftValues();
		while (leftss.hasNext()) {
			System.out.println(++j + ". left: " + leftss.next());
		}

	}

}
