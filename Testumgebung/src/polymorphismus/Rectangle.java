package polymorphismus;

class Rectangle {

	int length = 100, width = 200;

	int getLength() {
		return length;
	}

	int getWidth() {
		return width;
	}

	boolean isSquare() {
		return getLength() == getWidth();
	}

}
