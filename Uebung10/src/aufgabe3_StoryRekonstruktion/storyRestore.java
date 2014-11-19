package aufgabe3_StoryRekonstruktion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class storyRestore {
	
	public static void restoreStory() throws FileNotFoundException, IOException{
		Map<Integer, String> storyMap = new TreeMap<>();
		String ausgabe = "";
		try (InputStreamReader file = new InputStreamReader(new FileInputStream("/Users/Yanick/Dropbox/Schule/HSR/Module/OO/00-Eigene/Workspace/Uebung10/src/aufgabe3_StoryRekonstruktion/story-input.txt"), "UTF-8")){
			try (BufferedReader buffreader = new BufferedReader(file)){
				String zeile = buffreader.readLine();
				while (zeile != null && zeile.contains("=")){
					String[] zeilenParts = zeile.split("=");
					int key = Integer.parseInt(zeilenParts[0]);
					String wort = zeilenParts[1];
					storyMap.put(key, wort);
					zeile = buffreader.readLine();
				}
			}		
		}
		
		for(String story : storyMap.values()){
			System.out.print(story + " ");
		}
	}
}