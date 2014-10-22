package Aufgabe3_VisualisierungVonGrafiken;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Visualization {
	private interface Figure { 
		void draw(Graphics g);
	}
	
	private JFrame frame;
	private Collection<Figure> figures = new ArrayList<Figure>();
	
	public void drawRectangle(final int left, final int top, final int width, final int height, final int color) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				figures.add(new Figure() {
					@Override
					public void draw(Graphics g) {
						g.setColor(new Color(color));
						g.fillRect(left, top, width, height);
					}
				});
			}
		});
	}
	
	public void drawCircle(final int x, final int y, final int radius, final int color) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				figures.add(new Figure() {
					@Override
					public void draw(Graphics g) {
						g.setColor(new Color(color));
						g.fillArc(x, y, radius, radius, 0, 360);
					}
				});
			}
		});
	}
	
	public void drawText(final int x, final int y, final String text, final int color) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				figures.add(new Figure() {
					@Override
					public void draw(Graphics g) {
						g.setColor(new Color(color));
						g.drawChars(text.toCharArray(), 0, text.length(), x, y);
					}
				});
			}
		});
	}
	
	public void clear() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				figures.clear();
			}
		});
	}
	
	public Visualization() {
		frame = new JFrame();
		frame.setSize(1200, 800);
	    frame.setTitle("Visualization");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new Canvas() {
	    	private static final long serialVersionUID = 1L;
	    	
			@Override
		    public void paint(Graphics graphics) {
	    		for (Figure f : figures) { f.draw(graphics); }				
		    }
	    });
	    SwingUtilities.invokeLater(new Runnable() {
	    	public void run() {
	    	    frame.setVisible(true);
	    	}
	    });
	}
}