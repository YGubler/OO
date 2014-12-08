package aufgabe2_ReverseMap;

import java.util.Iterator;

class Test_ReverseMap {

	public static void main(String[] args) {


		ReverseMap<Integer, String> map = new ReverseMap<Integer, String>();
		map.put(123456, "Hans Meier");
		map.put(333999, "Clara Müller");
		map.put(3339399, "Clara sMüller");
		String name = map.getRight(123456); // returns “Hans Meier”
		int number = map.getLeft("Clara Müller"); // returns 333999
		
		System.out.println(name);
		System.out.println(number);
		
//		map.clear();
//		System.out.println(map.leftValues());
//		map.leftValues();
//		
//		Iterator<Integer> itL = map.leftValues();
//		System.out.println(itL.next());
//		System.out.println(map.leftValues());
//		for (String lefts : map){
//				System.out.println(lefts);
//		};
		
		System.out.println("\nGet all on the Right Side");
		int i = 0;
		Iterator<String> rights = map.rightValues();
		while (rights.hasNext()) {
		System.out.println(++i + ". right: " + rights.next());
		}
		
		System.out.println("\n" + map.getRight(123456)); // returns “Hans Meier”
		System.out.println(map.getLeft("Clara Müller")); // returns 333999


	}

}
