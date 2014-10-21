public class RecursiveBracketChecker {
	int i = 0;

	public boolean validate(String input) {
		StringReader reader = new StringReader(input);
		return validate(reader) && !reader.hasCurrent();
	}

	private boolean validate(StringReader reader) {
		if (reader.hasCurrent()) {
			char opening = reader.current();
			if (isOpeningBracket(opening)) {
				reader.next();
				if (validate(reader)) {
					if (reader.hasCurrent()
							&& matches(opening, reader.current())) {
						reader.next();
						validate(reader);
						return true;
					} else {
						if (reader.hasCurrent()) {
							reader.next();
						}
						return false;
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	private boolean isOpeningBracket(char character) {
		return character == '(' || character == '[' || character == '{'
				|| character == '<';
	}

	private boolean matches(char bracketOpen, char bracketClose) {
		return bracketOpen == '(' && bracketClose == ')' || bracketOpen == '['
				&& bracketClose == ']' || bracketOpen == '{'
				&& bracketClose == '}' || bracketOpen == '<'
				&& bracketClose == '>';
	}
}
