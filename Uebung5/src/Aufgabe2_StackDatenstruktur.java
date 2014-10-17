public class Aufgabe2_StackDatenstruktur {

	Object[] stack;
	int capacity;

	Aufgabe2_StackDatenstruktur(int capacity) {
		stack = new Object[capacity];
	}

	public void push(Object element) {
		if (isFull()) {
			System.err.println("Stack-Overflow");
		} else
			stack[size()] = element;
	}

	public Object pop() {
		if (isEmpty()) {
			System.err.print("Stack is empty\t");
			return null;
		} else {
			Object tmp = stack[size() - 1];
			stack[size() - 1] = null;
			return tmp;
		}
	}

	public Object peak() {
		if(isEmpty()){
			return null;
		}
		else{
			return stack[size() - 1];
		}
	}

	public int size() {
		int size = 0;
		for (Object object : stack) {
			if (object != null) {
				size++;
			}
		}
		return size;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else
			return false;
	}

	public boolean isFull() {
		return stack.length == size();

	}

}