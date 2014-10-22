package aufgabe1;

class TextBox extends Rectangle implements Text {
	protected int areaColor, textColor;
	protected String text;

	/**
	 * @param left
	 * @param top
	 * @param width
	 * @param heigt
	 * @param color
	 * @param areaColor
	 * @param textColor
	 * @param text
	 */
	TextBox(int left, int top, int width, int height, int color, int areaColor,
			int textColor, String text) {
		super(left, top, width, height, color);
		this.areaColor = areaColor;
		this.textColor = textColor;
		this.text = text;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTetColor() {
		return textColor;
	}

}
