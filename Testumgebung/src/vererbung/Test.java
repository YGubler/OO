package vererbung;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Test implements C, B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Set<String>> map = new HashMap<>();
		String a = "Hallo";
		map.put(1, new HashSet<String>(a));
	}


	public void print() {
		// TODO Auto-generated method stub
		
	}

}
