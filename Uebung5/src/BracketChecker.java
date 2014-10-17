public class BracketChecker {
	public boolean validate(String input) {

		// Stack Instanzieren
		BracketCheckerStack stack = new BracketCheckerStack(20);

		// TODO Implement bracket checker function here
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				stack.push(')');
			} else if (input.charAt(i) == '[') {
				stack.push(']');
			} else if (input.charAt(i) == '{') {
				stack.push('}');
			} else if (input.charAt(i) == '<') {
				stack.push('>');
			} else {
				if (stack.isEmpty() || input.charAt(i) != ((char) stack.pop())) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
