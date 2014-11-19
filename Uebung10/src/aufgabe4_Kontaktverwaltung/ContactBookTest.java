package aufgabe4_Kontaktverwaltung;

public class ContactBookTest {
	public static void main(String[] args) {
		writeTestData();
		testPersistedData();
	}

	private static void writeTestData() {
		ContactBook book = new ContactBook();
		book.addContact("Hans Meier", "Bahnhofstrasse 123, 8001 Zürich");
		book.addNumber("Hans Meier", "043 43 222 11 33", "office");
		book.addNumber("Hans Meier", "079 78 123 45 6", "mobile");
		book.save();
	}

	private static void testPersistedData() {
		ContactBook book = new ContactBook();
		book.load();
		String meier = book.findContact("Hans Meier").toString();
		String expected = "Contact [name=Hans Meier, address=Bahnhofstrasse 123, 8001 Zürich, numbers= [mobile: 079 78 123 45 6, office: 043 43 222 11 33]]";
		boolean testResult = meier.equals(expected);
		System.out.println("Test " + (testResult ? "ok" : "failed"));
	}
}
