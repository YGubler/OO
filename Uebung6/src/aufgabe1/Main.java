package aufgabe1;

import Aufgabe2_KonstanteFarben.NiceColors;
import Aufgabe3_VisualisierungVonGrafiken.*;

public class Main {

	public static void main(String[] args) {
		Shape[] array = new Shape [5];
		
		array[0] = new Rectangle (200, 300, 300, 200, NiceColors.BLUE);
		array[1] = new Rectangle (800, 600, 200, 200, NiceColors.BLACK);
		array[2] = new Circle (300, 600, 200, NiceColors.GREEN);
		array[3] = new Circle (700, 100, 100, NiceColors.ORANGE);	
		array[4] = new TextBox (1100, 300, 200, 400, NiceColors.WHITE, NiceColors.RED, "Hallo Rechteck");

		Drawing fenster = new Drawing (array);
		
		fenster.draw();
		
		fenster.printTexts();
		
		Shape r1 = new Rectangle(1, 1, 10, 10, NiceColors.RED);
		Shape r2 = new Rectangle(1, 1, 10, 10, NiceColors.RED);
		Shape b = new TextBox(1, 1, 10, 10, NiceColors.RED, NiceColors.GREEN, "Hallo");
		Shape c1 = new Circle(1, 1, 10, NiceColors.RED);

		System.out.println (r1.equals(r2) ? "Richtig" : "Falsch");
		System.out.println (r1.equals(b) ? "Falsch" : "Richtig");
		System.out.println (b.equals(r2) ? "Falsch" : "Richtig");
		System.out.println (r2.equals(c1) ? "Falsch" : "Richtig");
	}
}