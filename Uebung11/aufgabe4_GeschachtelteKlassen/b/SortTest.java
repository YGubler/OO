package b;
import java.util.Arrays;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		final List<String> list = Arrays.asList("UPPER", "up", "DOWN", "do", "reset", "REPEAT");
		System.out.println(list);
		list.sort(new Utilities.StringCaseInsensitiveComparator());
		
		System.out.println("Sorted case insenstively: " + list);
		list.sort(new Utilities.StringLengthComparator());
		System.out.println("Sorted by string lengths: " + list);
	}
}
