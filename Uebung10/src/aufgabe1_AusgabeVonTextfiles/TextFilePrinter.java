package aufgabe1_AusgabeVonTextfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class TextFilePrinter {

	public static void fileReadAndPrint(String path) throws FileNotFoundException, IOException {
		try (InputStream byteStream = new FileInputStream(path)) {
			try (Reader reader = new InputStreamReader(byteStream, "UTF-8")) {

				int textValue = reader.read();
				int i = 1;
				System.out.print(i++ + "\t");
				while (textValue >= 0) {
					char c = (char) textValue;
					if (c == '\n') {
						System.out.print(c);
						textValue = reader.read();
						System.out.print(i++ + "\t");

					} else {
						System.out.print(c);
						textValue = reader.read();
					}
				}
			}
		}

	}
}
