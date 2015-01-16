package klammerung;

import java.util.ArrayList;
import java.util.Collection;

class Klammerungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validParentheses(3));
	}

	public static Collection<String> validParentheses(int nofPairs) {
		Collection<String> list = new ArrayList<>();
		if (nofPairs == 0) {
			list.add("");
		} else {
			for (int k = 0; k < nofPairs; k++) {
				Collection<String> infixes = validParentheses(k);
				Collection<String> suffixes = validParentheses(nofPairs - k - 1);
				for (String infix : infixes) {
					for (String suffix : suffixes) {
						list.add("(" + infix + "l)" + suffix);
					}
				}
			}
		}
		return list;
	}

}
