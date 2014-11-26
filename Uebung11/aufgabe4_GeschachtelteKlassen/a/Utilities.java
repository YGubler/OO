package a;
import java.util.Comparator;

public class Utilities {
	private boolean trace;
	
	public Utilities(boolean trace) {
		this.trace = trace;
	}
	
	public class StringCaseInsensitiveComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (trace) {
				System.out.println("Comparing " + s1 + " with " + s2);
			}
			return s1.compareToIgnoreCase(s2);
		}	
	}
	
	public class StringLengthComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (trace) {
				System.out.println("Comparing " + s1 + " with " + s2);
			}
			return s1.length() - s2.length();
		}		
	}
}
