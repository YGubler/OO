package instanceOf;

class Main {

	public static void main(String[] args) {
		Figure f = new Rectangle();
		//Rectangle r = new Figure();
		System.out.println("instanceof Figure:\t" + (f instanceof Figure));
		System.out.println("instanceof Rectangle:\t" + (f instanceof Rectangle));
		String classF = f.getClass().toString();
		String classErwartet = Figure.class.toString();
		System.out.println("getClass == Figure:\t" + classF.equals(classErwartet));

	}

}
