package aufgabe1_AusgabeVonTextfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class TextFilePrinter {	

	public static void fileReadAndPrint(String path) throws FileNotFoundException, IOException{
		try (FileReader reader = new FileReader(path)) {
			int textValue = reader.read();
			int i = 1;
			System.out.print(i++ + "\t");
			while(textValue >= 0){
				char c = (char) textValue;
				if (c == '\n'){
					System.out.print(c);
					textValue = reader.read();
					System.out.print(i++ + "\t");
					
				}else {
					System.out.print(c);
					textValue = reader.read();
				}
			}
		}
	
	}
}

