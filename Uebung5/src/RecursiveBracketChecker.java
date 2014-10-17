public class RecursiveBracketChecker {
	public boolean validate(String input) {
		StringReader reader = new StringReader(input);
		return validate(reader) && !reader.hasCurrent();
	}
	
	private boolean validate(StringReader reader) {
		if(!reader.hasCurrent()){
			return true;
		}
//		else if ()
		
		return false;
	}

	private boolean isOpeningBracket(char character) {
		return  character == '(' || 
				character == '[' || 
				character == '{' || 
				character == '<';
	}

	private boolean matches(char bracketOpen, char bracketClose) {
		return bracketOpen == '(' && bracketClose == ')' || 
			   bracketOpen == '[' && bracketClose == ']' || 
			   bracketOpen == '{' && bracketClose == '}' || 
			   bracketOpen == '<' && bracketClose == '>';
	}
}
