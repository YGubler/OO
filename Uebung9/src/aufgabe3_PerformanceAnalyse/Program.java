package aufgabe3_PerformanceAnalyse;

import java.io.IOException;
import java.util.List;

public class Program {
	
	public void testCollection(List<Person> people){
		long timeStart = System.currentTimeMillis();
		int count = 0, totalAge = 0;
		for(Person p : people){
			if(p.getGender() == Gender.MALE){
				count++;
				totalAge += p.getAge();
			}
		}
		double result = totalAge / (double)count;
		System.out.println("testCollection:\t\t" + result);
		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");
	}
	
	public void testStream(List<Person> people){
		long timeStart = System.currentTimeMillis();
		@SuppressWarnings("unused")
		double result = people.stream().filter(p -> p.getGender() == Gender.MALE).mapToInt(p -> p.getAge())
		.average().getAsDouble();
		System.out.println("testStream:\t\t" + result);
		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");
	}
	
	public void testParallelStream(List<Person> people) {
		long timeStart = System.currentTimeMillis();
		@SuppressWarnings("unused")
		double result = people.parallelStream().filter(p -> p.getGender() == Gender.MALE).mapToInt(p -> p.getAge())
		.average().getAsDouble();
		System.out.println("testParallelStream:\t" + result);
		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");
	}
	
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("./src/aufgabe3_PerformanceAnalyse/large.csv");

		Program p = new Program();
//		long timeStart = System.currentTimeMillis();
		p.testCollection(people);
		p.testCollection(people);
		p.testCollection(people);
		p.testCollection(people);
		p.testCollection(people);
//		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");
		
//		timeStart = System.currentTimeMillis();
		p.testStream(people);
		p.testStream(people);
		p.testStream(people);
		p.testStream(people);
		p.testStream(people);
//		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");
		
//		timeStart = System.currentTimeMillis();
		p.testParallelStream(people);
		p.testParallelStream(people);
		p.testParallelStream(people);
		p.testParallelStream(people);
		p.testParallelStream(people);
//		System.out.println("\t\t\t" + (System.currentTimeMillis() - timeStart) + "ms");

	}
}
