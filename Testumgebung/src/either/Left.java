package either;

class Left<A, B> extends Either<A, B> {
	private A left;

	public Left(A left) {
		this.left = left;
	}

	public A getLeft() {
		return left;
	}

	public A get() {
		return left;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Object other = ((Left<?, ?>) obj).get();

		if (left == other) {
			return true;
		}
		if (left == null) {
			return false;
		} else {
			return left.equals(other);
		}

	}
}
