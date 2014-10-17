public class RecursiveBracketCheckerTest {
	public static void main(String[] args) {
		bracketTest("Test1", "", true);
		bracketTest("Test2", "(", false);
		bracketTest("Test3", ")", false);
		bracketTest("Test4", "(<[()]>){}", true);
		bracketTest("Test5", "()[]{}<>", true);
		bracketTest("Test6", "(((<>)))([<>])", true);
		bracketTest("Test7", "<", false);
		bracketTest("Test8", "[()>", false);
		bracketTest("Test9", "{)(][}", false);
		bracketTest("Test10", "({)}", false);
	}

	private static void bracketTest(String testName, String input, boolean expected) {
		RecursiveBracketChecker checker = new RecursiveBracketChecker();
		boolean validationResult = checker.validate(input);
		System.out.println(testName + ": " + (expected == validationResult ? "ok" : "failed"));
	}
}
