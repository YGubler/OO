package aufgabe4_InnereStackKonsistenz;

class Main {

	public static void main(String[] args) throws StackSizeException, StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException  {
//		try {
//			Stack stack = new Stack(9999999);
//		} catch (StackSizeException e) {
//		}
//		
//		Stack stack = new Stack(10);
//
//		try {
//			stack.pop();
//		} catch (StackIsEmptyException e) {
//
//		}
//
//		try {
//
//			String element1 = new String("Test");
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			stack.push(element1);
//			// stack.push(element1);
//			element1 = null;
//			stack.push(element1);
//		} catch (StackElementNullException | StackFullException e) {
//
//		}
		
		StackWithError stackWithError = new StackWithError(9);
		try {
			String element1 = new String("Test");
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);
			stackWithError.push(element1);

		}catch (Exception e){
			
		}
		
	}
}
