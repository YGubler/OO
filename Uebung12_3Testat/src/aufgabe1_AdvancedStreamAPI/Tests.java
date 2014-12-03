package aufgabe1_AdvancedStreamAPI;

public class Tests {
	public static void main(String[] args) throws Exception {
		SampleData.getPersonStream().forEach(System.out::println);
		SampleData.getDoubleStream().forEach(System.out::println);
		
		System.err.println(StreamExtensions.median(SampleData.getDoubleStream()));
		System.err.println(StreamExtensions.median(SampleData.getPersonStream()) + "\n");
		
		StreamExtensions.revert(SampleData.getPersonStream()).forEach(System.err::println);
		StreamExtensions.revert(SampleData.getDoubleStream()).forEach(System.err::println);
		System.out.println("\n");
		
		StreamExtensions.smallest(SampleData.getPersonStream(), 3).forEach(System.err::println);
		StreamExtensions.smallest(SampleData.getDoubleStream(), 3).forEach(System.err::println);
		System.out.println("\n");
		
		StreamExtensions.largest(SampleData.getPersonStream(), 3).forEach(System.err::println);
		StreamExtensions.largest(SampleData.getDoubleStream(), 3).forEach(System.err::println);
		
	}
}
