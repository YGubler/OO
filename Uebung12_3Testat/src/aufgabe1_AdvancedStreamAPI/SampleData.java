package aufgabe1_AdvancedStreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class SampleData {
	private static final int DOUBLE_LIST_SIZE = 100;
	private static final int RANDOM_SEED = 4711;

	public static Stream<Double> getDoubleStream() {
		Random random = new Random(RANDOM_SEED);
		return DoubleStream.generate(() -> random.nextDouble()).limit(DOUBLE_LIST_SIZE).boxed();
	}

	public static Stream<Person> getPersonStream() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Klaus", "Adam", createDate(1978, 4, 13),
				"Oberseestrasse 14", 8640, "Rapperswil", "Student", "male"));
		persons.add(new Person("Clara", "Müller", createDate(1978, 4, 13),
				"Oberseestrasse 14", 8640, "Rapperswil", "Student", "female"));
		persons.add(new Person("Hans", "Meier", createDate(1980, 1, 2),
				"Waldweg 2", 8640, "Rapperswil", "Student", "male"));
		persons.add(new Person("Petra", "Schneider", createDate(1970, 8, 8),
				"Bahnhofstrasse 1", 8001, "Zürich", "Manager", "female"));
		persons.add(new Person("Klaus", "Schnell", createDate(1982, 12, 10),
				"Rütistrasse", 8630, "Rüti", "Engineer", "male"));
		persons.add(new Person("Peter", "Winter", createDate(1965, 3, 3),
				"Hinterweg 12", 5000, "Aarau", "Carpenter", "male"));
		persons.add(new Person("Sandra", "Vogt", createDate(1972, 11, 30),
				"Altstadtweg 8", 8001, "Zürich", "Banker", "female"));
		persons.add(new Person("Markus", "Marxer", createDate(1976, 2, 5),
				"Hauptstrasse 7", 6002, "Luzern", "Baker", "male"));
		persons.add(new Person("Anna", "Widmer", createDate(1980, 7, 7),
				"Albisstrasse", 8004, "Zürich", "Teacher", "female"));
		persons.add(new Person("Hans", "Steiner", createDate(1976, 10, 10),
				"Seeufer 232", 8640, "Rapperswil", "Student", "male"));
		persons.add(new Person("Vreni", "Affolter", createDate(1981, 4, 30),
				"Altstadtweg 17", 4000, "Basel", "Student", "female"));
		persons.add(new Person("Karl", "Widmer", createDate(1977, 7, 31),
				"Zentralstrasse 87", 8640, "Rapperswil", "Engineer", "male"));
		persons.add(new Person("Franz", "Eberhard", createDate(1978, 1, 1),
				"Hauptstrasse 10", 8640, "Rapperswil", "Student", "male"));
		persons.add(new Person("Hedi", "Zürcher", createDate(1950, 3, 22),
				"Bergstrasse 98", 8001, "Zürich", "Retired", "female"));
		persons.add(new Person("Monika", "Wehrli", createDate(1967, 9, 17),
				"Stadtweg 1", 5000, "Aarau", "Entrepreneur", "female"));
		persons.add(new Person("Hans", "Beeler", createDate(1982, 6, 11),
				"Hauptstrasse 121", 8630, "Rüti", "Student", "male"));
		return persons.stream();
	}

	private static LocalDate createDate(int year, int month, int dayOfMonth) {
		return LocalDate.of(year, month, dayOfMonth);
	}
}
