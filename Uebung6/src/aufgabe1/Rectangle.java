package aufgabe1;

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
}
