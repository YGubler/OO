import java.util.Scanner;


public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Textausgabe
				System.out.println("Geben Sie die Anzahl Sekunden ein die in Stunden, Minuten und Sekunden ausgegeben werden soll.");
				
				//Sekunden einlesen
				int sekunden = numFromConsole();
				
				//Anzahl ganze Tage berechnen
				int day = sekunden / 86400;
				
				//Anzahl rest Sekunden berechnen
				int restSekunden = sekunden % 86400;
				
				//Anzahl ganze Stunden berechnen
				int std = restSekunden / 3600;
				
				//Anzahl rest Sekunden berechnen
				restSekunden = sekunden % 3600;
				
				//Anzahl ganze Minuten berechnen
				int min = restSekunden / 60;
				
				//Anzahl rest Sekunden berechnen
				int sek =  restSekunden % 60;
				
				//Ausgabe des Resultats in Stunden, Minuten, Sekunden
				System.out.println(sekunden + " Sekunden sind: " + day + " Tage, " + std + " Stunden, " + min + " Minuten, " + sek + " Sekunden,");

	}
	
	public static int numFromConsole(){
		Scanner numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
		numFromConsole.close();
		return num;
		
	}

}
