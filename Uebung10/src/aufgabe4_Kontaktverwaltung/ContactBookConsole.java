package aufgabe4_Kontaktverwaltung;

import java.util.Scanner;

public class ContactBookConsole {
	public static void main(String[] args) {
		ContactBook book = new ContactBook();
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			while (!line.isEmpty()) {
				try {
					processLine(book, line);
				} catch (InputException | IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				line = scanner.nextLine();
			}
		}
	}

	public static void processLine(ContactBook book, String line) throws InputException {
		CommandParser parser = new CommandParser(line);
		if (parser.tryRead("load")) {
			parser.checkEnd();
			book.load();
		} else if (parser.tryRead("save")) {
			parser.checkEnd();
			book.save();
		} else if (parser.tryRead("add")) {
			if (parser.tryRead("contact")) {
				String name = parser.readString();
				String address = parser.readString();
				parser.checkEnd();
				book.addContact(name, address);
			} else if (parser.tryRead("number")) {
				String name = parser.readString();
				String number = parser.readString();
				String description = parser.readString();
				parser.checkEnd();
				book.addNumber(name, number, description);
			} else {
				throw new InputException("Invalid add command");
			}
		} else if (parser.tryRead("find")) {
			String name = parser.readString();
			Contact contact = book.findContact(name);
			parser.checkEnd();
			if (contact == null) {
				System.out.println("not present");
			} else {
				System.out.println(contact);
			}
		} else {
			throw new InputException("Invalid command");
		}
	}

	@SuppressWarnings("serial")
	static class InputException extends Exception {
		public InputException(String message) {
			super(message);
		}
	}

	static class CommandParser {
		private String line;

		public CommandParser(String line) {
			this.line = line;
		}

		public boolean tryRead(String command) {
			if (line.startsWith(command)) {
				line = line.substring(command.length());
				skipBlanks();
				return true;
			} else {
				return false;
			}
		}

		private void skipBlanks() {
			while (line.startsWith(" ")) {
				line = line.substring(1);
			}
		}

		public void checkEnd() throws InputException {
			if (line.length() == 1) {
				throw new InputException("Premature end of command");
			}
		}

		public String readString() throws InputException {
			if (!tryRead("\"")) {
				throw new InputException("opening double quote missing");
			}
			int index = line.indexOf('\"');
			if (index < 0) {
				throw new InputException("closing double quote missing");
			}
			String text = line.substring(0, index);
			line = line.substring(index + 1);
			skipBlanks();
			return text;
		}
	}
}
