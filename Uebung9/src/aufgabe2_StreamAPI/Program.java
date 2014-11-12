package aufgabe2_StreamAPI;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("./src/aufgabe2_StreamAPI/people.csv");

		/*
		 * a) Alle unterschiedlichen Vornamen weiblicher Personen mit maximal 3
		 * Buchstaben
		 */
		System.out.println("Aufgabe a)");
		people.stream().filter(p -> p.getFirstName().length() <= 3 && p.getGender() == Gender.FEMALE)
				.map(p -> p.getFirstName()).distinct().forEach(System.out::println);

		/*
		 * b) Durchschnittsalter aller männlicher Personen
		 */
		System.out.println("\n\nAufgabe b)");
		System.out.println(people.stream().filter(p -> p.getGender() == Gender.MALE).mapToInt(p -> p.getAge())
				.average().getAsDouble());

		/*
		 * c) Minimal und Maximalalter aller Personen in Zürich
		 */
		// Minimal
		System.out.println("\n\nAufgabe c) min");
		System.out.println(people.stream().filter(p -> p.getCity().contains("Zürich")).mapToInt(p -> p.getAge()).min()
				.getAsInt());

		// Maximal
		System.out.println("Aufgabe c) max");
		System.out.println(people.stream().filter(p -> p.getCity().contains("Zürich")).mapToInt(p -> p.getAge()).max()
				.getAsInt());

		/*
		 * d) Top 10 Verdiener (Jahreseinkommen)
		 */
		System.out.println("\n\n" + "Aufgabe d)");
		people.stream().map(p -> p.getLastName() + " " + p.getFirstName()).sorted().limit(10)
				.forEach(System.out::println);

		/*
		 * e) Durchschnittsalter pro Ort (Konsultieren Sie hierfür die Klasse
		 * Collectors in der Java API)
		 */
		System.out.println("\n\nAufgabe e)");
		
//		HashMap<String, List<Integer>> x = (HashMap<String, List<Integer>>) people.stream().collect(
//				Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getAge, Collectors.toList())));
//		
//		for(HashMap)
		System.out.println(people.stream().collect(
				Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getAge, Collectors.toList())))
				);
	}
}
