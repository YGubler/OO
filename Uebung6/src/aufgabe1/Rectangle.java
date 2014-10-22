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

	}

	int getHeight() {

	}

	void resize(int width, int height) {

	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAreaColor() {
		// TODO Auto-generated method stub
		return 0;
	}
}
