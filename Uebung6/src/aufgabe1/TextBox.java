package aufgabe1;

import Aufgabe3_VisualisierungVonGrafiken.Visualization;

class TextBox extends Rectangle implements Text {
	protected int textColor;
	protected String text;

	/**
	 * @param left
	 * @param top
	 * @param width
	 * @param heigt
	 * @param color
	 * @param areaColor
	 * @param textColor
	 * @param text
	 */
	TextBox(int left, int top, int width, int height, int areaColor, int textColor, String text) {
		super(left, top, width, height, areaColor);
		this.textColor = textColor;
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTextColor() {
		return textColor;
	}

	@Override
	public void draw(Visualization visualization) {
		super.draw(visualization);
		visualization.drawText(super.left, super.top, this.text, this.textColor);
	}

	@Override
	public boolean equals(Shape shape) {
		if (getClass() == shape.getClass()) {
			TextBox textBox = (TextBox) shape;
			if (this.getX() == shape.getX() && this.getY() == shape.getY() && this.getHeight() == textBox.getHeight()
					&& this.getWidth() == textBox.getWidth() && this.color == textBox.color
					&& getText() == textBox.getText() && getTextColor() == textBox.getTextColor()) {
				return true;
			}
		}
		return false;
	}
}
