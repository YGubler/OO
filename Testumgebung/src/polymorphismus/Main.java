package polymorphismus;

import java.util.HashMap;
import java.util.Map;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Rectangle r = new Square();
//		System.out.println(r.length);
//
//		Rectangle s = new Square();
//		System.out.println(s.getLength());
//
//		Rectangle t = new Square();
//		System.out.println(t.isSquare());
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(1, 500);
		map.put(2, 100);

		for (Integer i : map.keySet()){
			System.out.println(i);
			System.out.println(map.get(i));
		}
		
		


//		int[] a = new int[3];
//		a[0] = 1;
//		System.out.println(a.length);
//		System.out.println(a[0]);
//		System.out.println(a[0]);
		
		
	}
}
