public class RecursiveBracketChecker {
	public boolean validate(String input) {
		StringReader reader = new StringReader(input);
		return validate(reader) && !reader.hasCurrent();
	}
	
	private boolean validate(StringReader reader) {
		char current = '0';
		//hat es ein Zeichen?
		if (reader.hasCurrent()) {
			current = reader.current();
			//ist da aktuelle Zeichen ein Öffnungsklammer, wenn ja hole das nächste Zeichen und rufe validate wieder auf.?
			if (isOpeningBracket(current)){
				reader.next();			
				return validate(reader);
			}
			else if (!isOpeningBracket(current)){
				return false;
			}
			else
				reader.next();
				char next = reader.current();
				if (matches(current, next)){
					return validate(reader);
				}
				else return false;
		}
		else if (!reader.hasCurrent() && current == 0){
			return true;
		}
		else return false;
		}

//		//Ist das aktuelle Zeichen keine offene Klammer, dann stimmen die Klammern
//		else if (!isOpeningBracket(reader.current())){
//			return true;
//		}
//		//nächstes Zeichen einlesen
//		reader.next();
//		
//		//
//		else if(){
//			return 
//			
//		}
//		else{
//			reader.next();
//			return validate(reader);
//		}
//			
//			
//			
//		if (!reader.hasCurrent()) {
//			return true;
//		}
//		char opening = reader.current();
//		if (!isOpeningBracket(opening)) {
//			return true;
//		}
//		reader.next();
//		if (!validate(reader)) {
//			return false;
//		}
//		if (!reader.hasCurrent()) {
//			return false;
//		}
//		char closing = reader.current();
//		if (!matches(opening, closing)) {
//			return false;
//		}
//		reader.next();
//		return validate(reader);
	

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
