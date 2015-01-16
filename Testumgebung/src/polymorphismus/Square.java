package polymorphismus;

class Square extends Rectangle {
	
	int length = 50;
	int width = 0;
	

	
	int getLength() {
		return this.length;
	}

	@Override
	int getWidth() {
		return length;
	}
	
	public void print(){
		System.out.println("IO");
	}
}