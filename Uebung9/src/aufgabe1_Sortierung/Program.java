package aufgabe1_Sortierung;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) throws IOException {
		List<Person> people = PeopleData.read("./src/aufgabe1_Sortierung/people.csv");
		/*
		 * a) Verwenden Sie zuerst Methodenreferenzen für die Kriterien
		 */

		// Aufsteigend nach Alter
		// Collections.sort(people, Program::compareByAge);

		// Absteigend nach Alter
		// Collections.sort(people, Program::compareByAgeDESC);

		// Aufsteigend nach Nachname
		// Collections.sort(people, Program::compareByLastName);

		// Aufsteigend nach Ortschaft, Nachname und Vorname
		// Collections.sort(people, Program::compareByTownLastNameFirstName);

		/*
		 * b) Implementieren Sie die Kriterien dann mit Lambda Ausdrücken.
		 */

		// Aufsteigend nach Alter
		// Collections.sort(people, (Person p1, Person p2) -> {
		// return p1.getAge() - p2.getAge();
		// });

		// Absteigend nach Alter
		// Collections.sort(people, (Person p1, Person p2) -> {
		// return p2.getAge() - p1.getAge();
		// });

		// Aufsteigend nach Nachname
		// Collections.sort(people, (Person p1, Person p2) -> {
		// return p1.getLastName().compareTo(p2.getLastName());
		// });

		// Aufsteigend nach Ortschaft, Nachname und Vorname
		Collections.sort(people, (Person p1, Person p2) -> {
			int compValue = p1.getCity().compareTo(p2.getCity());
			if (compValue == 0)
				compValue = p1.getLastName().compareTo(p2.getLastName());
			if (compValue == 0)
				compValue = p1.getFirstName().compareTo(p2.getFirstName());
			return compValue;
		});

		
		PeopleData.write("./src/aufgabe1_Sortierung/sorted.csv", people);
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
