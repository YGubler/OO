package c;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTest {
	private static final boolean TRACE = true;
	
	public static void main(String[] args) {
		final List<String> list = Arrays.asList("UPPER", "up", "DOWN", "do", "reset", "REPEAT");
		System.out.println(list);
		list.sort(
			new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					if (TRACE) {
						System.out.println("Comparing " + s1 + " with " + s2);
					}
					return s1.compareToIgnoreCase(s2);
				}
		}				
		);
		
		System.out.println("Sorted case insenstively: " + list);
		list.sort(
			new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					if (TRACE) {
						System.out.println("Comparing " + s1 + " with " + s2);
					}
					return s1.length() - s2.length();
				}		
			}		
				
		);
		System.out.println("Sorted by string lengths: " + list);
	}
}
