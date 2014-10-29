package aufgabe3_RobusterStack;

public class Stack {
	private final Object[] elements;
	private int nextFreeIndex;

	public Stack(int capacity) throws StackSizeException {
		if (0 < capacity && capacity <= 65536){
			elements = new Object[capacity];
			nextFreeIndex = 0;
		} else {
			throw new  StackSizeException();
		}
	}

	public void push(Object element) throws StackFullException, StackElementNullException  {
		if (isFull()){
			throw new StackFullException();
		}
		if (element == null) {
			throw new StackElementNullException();
		}
		elements[nextFreeIndex++] = element;
	}

	public Object pop() throws StackIsEmptyException {
		Object result = peek();
		if (result != null) {
			elements[--nextFreeIndex] = null;
		} else throw new StackIsEmptyException();
		return result;
	}

	public Object peek() {
		if (isEmpty()) {
//			System.err.println("Stack is empty.");
			return null;
		}
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
}
