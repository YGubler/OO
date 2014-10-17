class StringReader {
	private String input;
	private int position;
	
	public StringReader(String input) {
		this.input = input;
		position = 0;
	}
	
	public char current() {
		return input.charAt(position);
	}
	
	public void next() {
		position++;
	}
	
	public boolean hasCurrent() {
		return position < input.length();
	}
}