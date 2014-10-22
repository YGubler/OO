package Aufgabe3_VisualisierungVonGrafiken;

import aufgabe1.*;

public class Drawing {
	private Shape[] figures;
	Visualization visualization = new Visualization();
			
	public Drawing(Shape[] figures){
		this.figures = figures;
	}
	public void draw(){
		this.visualization.clear();
		for(Shape tmp : figures){
			tmp.draw(this.visualization);
		}
		
	}
	public void move(int deltaX, int deltaY){
		for(Shape tmp : figures){
			tmp.move(deltaX, deltaY);
		}
	}
	
	public void printTexts(){
		for(Shape tmp : figures){
			if (tmp instanceof Text){
				System.out.println(((Text) tmp).getText());
			}
		}
	}
}
