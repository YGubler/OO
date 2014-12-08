package aufgabe2_ReverseMap;

class Test_ReverseMap {

	public static void main(String[] args) {


		ReverseMap<Integer, String> map = new ReverseMap<Integer, String>();
		map.put(123456, "Hans Meier");
		map.put(333999, "Clara M�ller");
		map.put(3339399, "Clara sM�ller");
		String name = map.getRight(123456); // returns �Hans Meier�
		int number = map.getLeft("Clara M�ller"); // returns 333999
		
		System.out.println(name);
		System.out.println(number);
		
		map.clear();
		System.out.println(map.leftValues());
//		for (Integer lefts : map.leftValues()){
//			System.out.println(lefts);
//		}
		
		System.out.println("\n" + map.getRight(123456)); // returns �Hans Meier�
		System.out.println(map.getLeft("Clara M�ller")); // returns 333999


	}

}
