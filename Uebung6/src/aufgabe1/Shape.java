package aufgabe1;

import Aufgabe3_VisualisierungVonGrafiken.Visualization;

public interface Shape extends GrapicItem{
	int getAreaColor();
	void draw(Visualization visualization);
	boolean equals(Shape shape);
}
