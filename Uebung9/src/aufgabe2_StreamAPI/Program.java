package aufgabe2_StreamAPI;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("./src/aufgabe2_StreamAPI/people.csv");

		/*
		 * a) Alle unterschiedlichen Vornamen weiblicher Personen mit maximal 3
		 * Buchstaben
		 */
		System.out.println("Aufgabe a)");
		 people
		 .stream()
		 .filter(p -> p.getFirstName().length() <= 3 && p.getGender() ==
		 Gender.FEMALE)
		 .map(p -> p.getFirstName())
		 .distinct()
		 .forEach(System.out::println);

		/*
		 * b) Durchschnittsalter aller männlicher Personen
		 */
		 System.out.println("\n\nAufgabe b)");
		 System.out.println(people.stream().filter(p -> p.getGender() ==
		 Gender.MALE).mapToInt(p -> p.getAge())
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
		System.out.println("\n\n"
				+ "Aufgabe d)");
		people
			.stream()
			.map(p -> p.getLastName() + " " + p.getFirstName())
			.sorted()
			.limit(10)
			.forEach(System.out::println);

		/*
		 * e) Durchschnittsalter pro Ort (Konsultieren Sie hierfür die Klasse
		 * Collectors in der Java API)
		 */
		System.out.println("\n\nAufgabe e)");
		people
			.stream()
			.collect(groupingBy(p -> p.getCity))
			;
	}

	static int compareByAge(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}

	static int compareByAgeDESC(Person p1, Person p2) {
		return p2.getAge() - p1.getAge();
	}

	static int compareByLastName(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	}

	static int compareByTownLastNameFirstName(Person p1, Person p2) {
		int compValue = p1.getCity().compareTo(p2.getCity());
		if (compValue == 0)
			compValue = p1.getLastName().compareTo(p2.getLastName());
		if (compValue == 0)
			compValue = p1.getFirstName().compareTo(p2.getFirstName());
		return compValue;
	}
}
