
public class Rectangle {
	private Point topLeft;
	private Point bottomRight;
	
	public Rectangle(Point topLeft, Point bottomRight){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public Rectangle(int tx, int ty, int bx, int by){
		this.topLeft = new Point(tx, ty);
		this.bottomRight = new Point(bx, by);
	}
	
	public Rectangle(Point topLeft, int size){
		this.topLeft = topLeft;
		this.bottomRight = new Point(topLeft.getX() + size, topLeft.getY() + size);
	}

	/**
	 * @return the topLeft
	 */
	public Point getTopLeft() {
		return topLeft;
	}

	/**
	 * @return the bottomRight
	 */
	public Point getBottomRight() {
		return bottomRight;
	}
	
	public boolean isSquare(){
		return ((this.topLeft.getX() - this.bottomRight.getX()) == (this.topLeft.getY() - bottomRight.getY()));
		
	}
	
	public boolean isSame(Rectangle other){
		return (this.topLeft.getX() == other.getTopLeft().getX() &&
				this.topLeft.getY() == other.getTopLeft().getY() &&
				this.bottomRight.getX() == other.getBottomRight().getX() &&
				this.bottomRight.getY() == other.getBottomRight().getY());
	}
	
	public boolean encloses(Rectangle other){
		return (this.topLeft.getX() <= other.getTopLeft().getX() &&
				this.topLeft.getY() >= other.getTopLeft().getY() &&
				this.bottomRight.getX() >= other.getBottomRight().getX() &&
				this.bottomRight.getY() <= other.getBottomRight().getY());
	}
	
	public boolean overlaps(Rectangle other){
		return (this.topLeft.getX() < other.bottomRight.getX() &&
				this.bottomRight.getX() > other.topLeft.getX() &&
				this.topLeft.getY() > other.bottomRight.getY() &&
				this.bottomRight.getY() < other.topLeft.getY());
	}
	
	public Rectangle stretch(int factor){
		int x, y;
		x = (this.bottomRight.getX() - this.topLeft.getX()) * factor + topLeft.getX();
		y = (this.bottomRight.getY() - this.topLeft.getY()) * factor + topLeft.getY();
		
		return new Rectangle(topLeft, new Point(x, y));
	}
	
	public Rectangle shrink(int factor){
		int x, y;
		x = (this.bottomRight.getX() - this.topLeft.getX()) / factor + topLeft.getX();
		y = (this.bottomRight.getY() - this.topLeft.getY()) / factor + topLeft.getY();
		
		return new Rectangle(topLeft, new Point(x, y));
	}

	@Override
	public String toString() {
		return "Rectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight
				+ "]";
	}
	
	
}
