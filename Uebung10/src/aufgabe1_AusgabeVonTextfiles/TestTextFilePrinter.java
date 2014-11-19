package aufgabe1_AusgabeVonTextfiles;

import java.io.FileNotFoundException;
import java.io.IOException;

class TestTextFilePrinter {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "src/aufgabe1_AusgabeVonTextfiles/Text.txt";
		TextFilePrinter.fileReadAndPrint(path);
		
		String path = "src/aufgabe1_AusgabeVonTextfiles/Text.txt";
		TextFilePrinter.fileReadAndPrint(path);


	}

}
