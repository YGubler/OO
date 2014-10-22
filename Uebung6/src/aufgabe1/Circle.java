package aufgabe1;

class Circle implements Shape {
	protected int centerX, centerY, radius, color;

	@Override
	public int getAreaColor() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param centerX
	 * @param centerY
	 * @param radius
	 * @param color
	 */
	Circle(int centerX, int centerY, int radius, int color) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.color = color;
	}

	int getRadius() {
		return radius;
	}

	@Override
	public int getX() {
		return this.centerX;
	}

	@Override
	public int getY() {
		return this.centerY;
	}

	@Override
	public void move(int x, int y) {
		this.centerX += x;
		this.centerY += y;
	}

}
