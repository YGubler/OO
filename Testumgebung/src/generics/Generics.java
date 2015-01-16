package generics;

class Generics<T extends Comparable<T>> {
	private T lower;
	private T upper;

	public Generics(T lower, T upper) {
		if (lower.compareTo(upper) > 0) {
			throw new IllegalArgumentException();
		} else {
			this.lower = lower;
			this.upper = upper;
		}
	}

	public T getLower() {
		return lower;
	}

	public T getUpper() {
		return upper;
	}

	public boolean includes(T value){
		return lower.compareTo(value) <= 0 && value.compareTo(upper) <= 0;
	}
}
