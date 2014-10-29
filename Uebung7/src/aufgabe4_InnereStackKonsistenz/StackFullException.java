package aufgabe4_InnereStackKonsistenz;

class StackFullException extends Exception {
	public StackFullException() {
		System.out.println("StackFullException greift");
	}

}
