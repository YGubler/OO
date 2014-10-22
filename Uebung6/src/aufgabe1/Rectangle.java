package aufgabe1;

import Aufgabe3_VisualisierungVonGrafiken.Visualization;

class Rectangle implements Shape {
	protected int left, top, width, height, color;

	/**
	 * @param left
	 * @param top
	 * @param width
	 * @param height
	 * @param color
	 */
	Rectangle(int left, int top, int width, int height, int color) {
		super();
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	int getWidth() {
		return width;
	}

	int getHeight() {
		return height;
	}

	void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int getX() {
		return left;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public void move(int x, int y) {
		this.left += x;
		this.top += y;
	}

	@Override
	public int getAreaColor() {
		return this.color;
	}

	@Override
	public void draw(Visualization visualization) {
		visualization.drawRectangle(this.left, this.top, this.width,
				this.height, this.color);

	}

	@Override
	public boolean equals(Shape shape) {
		if (getClass() == shape.getClass()) {
			Rectangle rectangle = (Rectangle) shape;
			if (this.getX() == shape.getX() && this.getY() == shape.getY()
					&& this.getHeight() == rectangle.getHeight()
					&& this.getWidth() == rectangle.getWidth()
					&& this.color == rectangle.color) {
				return true;
			}
		}
		return false;
	}

}
