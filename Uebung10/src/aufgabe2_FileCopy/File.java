package aufgabe2_FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class File {
	
	public static void copyFile() throws FileNotFoundException, IOException{
		System.out.println("Geben Sie die zu kopierende Datei an:");
		String source = pathFromConsole();
		System.out.println("Geben Sie das Ziel an:");
		String target = pathFromConsole();
		
		try(FileInputStream fis = new FileInputStream(source)){
			try(FileOutputStream fos = new FileOutputStream(target, true)){
				int value = fis.read();
				while (value >= 0){
					fos.write(value);
					value = fis.read();
				}
			}
			
		}
	}
	
	public static String pathFromConsole(){
		Scanner pathFromConsole = new Scanner(System.in);
		String path = pathFromConsole.nextLine();
		return path;
	}
}
