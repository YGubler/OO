package aufgabe4_InnereStackKonsistenz;

class StackWithError extends Stack {

	public StackWithError(int capacity) throws StackSizeException, StackNullPointerFrom0ToStackFException,
			StackNullPointerAfterStackFException {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	
	//Methode welche den Stack inkonsitent macht
	public Object peek() throws StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException{
		if (this.size() != 0 && this.size() > 5) {
			elements [this.size() - 5] = null;
			invariante();
			return elements[nextFreeIndex - 1];
		}else {
			// System.err.println("Stack is empty.");
			invariante();
			return null;
		}
	}

}
