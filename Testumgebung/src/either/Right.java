package either;

class Right<A, B> extends Either<A, B> {
	private B right;
	public Right (B right){
		this.right = right;
	}
	
	public B getRight(){
		return right;
	}
	public B get(){
		return right;
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
		Object other = ((Right<?, ?>) obj).get();

		if (right == other) {
			return true;
		}
		if (right == null) {
			return false;
		} else {
			return right.equals(other);
		}

	}
}
