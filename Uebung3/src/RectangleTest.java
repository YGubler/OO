
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(1, 1, 5, 9);
		Rectangle a = new Rectangle(0, 6, 2, 4);
		Rectangle b = new Rectangle(1, 5, 5, 0);
		Rectangle c = new Rectangle(0, 5, 5, 0);
		Rectangle d = new Rectangle(1, 4, 4, 1);
		System.out.println(r);
		System.out.println(r.stretch(2));
		System.out.println(r.shrink(2));
		System.out.println(r.isSame(r));
		System.out.println(r.stretch(2).shrink(2).isSame(r));
		
		System.out.println("\nOverlaps:\t" + a.overlaps(b));
		System.out.println("\nEncloses:\t" + c.encloses(d));
		System.out.println("\nSize:\t" + new Rectangle(new Point(1, 2), 2));

	}

}
