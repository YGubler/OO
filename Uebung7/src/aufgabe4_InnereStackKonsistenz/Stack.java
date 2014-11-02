package aufgabe4_InnereStackKonsistenz;

public class Stack {
	protected final Object[] elements;
	protected int nextFreeIndex;

	public Stack(int capacity) throws StackSizeException, StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException {
		if (0 < capacity && capacity <= 65536) {
			elements = new Object[capacity];
			nextFreeIndex = 0;
		} else {
			throw new StackSizeException();
		}
		invariante();
	}

	public void push(Object element) throws StackFullException, StackElementNullException, StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException {
		if (isFull()) {
			throw new StackFullException();
		}
		if (element == null) {
			throw new StackElementNullException();
		}
		elements[nextFreeIndex++] = element;
		invariante();
	}

	public Object pop() throws StackIsEmptyException, StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException {
		Object result = peek();
		if (result != null) {
			elements[--nextFreeIndex] = null;
		} else
			throw new StackIsEmptyException();
		invariante();
		return result;
	}

	public Object peek() throws StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException {
		if (isEmpty()) {
			// System.err.println("Stack is empty.");
			invariante();
			return null;
		}
		invariante();
		return elements[nextFreeIndex - 1];
	}

	public int size() {
		return nextFreeIndex;
	}

	public boolean isEmpty() {
		return nextFreeIndex == 0;
	}

	public boolean isFull() {
		return nextFreeIndex == elements.length;
	}

	public void invariante() throws StackNullPointerFrom0ToStackFException, StackNullPointerAfterStackFException{
		int counter = nextFreeIndex - 1;
		for (int i = 0; i < counter; i++){
			if(elements[i] == null){
				throw new StackNullPointerFrom0ToStackFException();
			}
		}
		for (int j = nextFreeIndex; j < elements.length; j++){
			if (elements[j] != null){
				throw new StackNullPointerAfterStackFException();
			}
		}
	}
}
