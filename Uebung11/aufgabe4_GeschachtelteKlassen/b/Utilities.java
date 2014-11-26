package b;
import java.util.Comparator;

public class Utilities {
	private static boolean trace;
	
//	public Utilities(boolean trace) {
//		Utilities.trace = trace;
//	}
	
	public static class StringCaseInsensitiveComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (trace) {
				System.out.println("Comparing " + s1 + " with " + s2);
			}
			return s1.compareToIgnoreCase(s2);
		}	
	}
	
	public static class StringLengthComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (trace) {
				System.out.println("Comparing " + s1 + " with " + s2);
			}
			return s1.length() - s2.length();
		}		
	}
}
