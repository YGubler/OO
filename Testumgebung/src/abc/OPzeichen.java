package abc;

class OPzeichen {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		y = -x;
		System.out.println(y);
		System.out.println(digitSum(1948));
		
		float f = 123456789;
		while (f-- > 0){
			System.out.println(f);
		}
	}

	public static int digitSum(int number) {
		int result = 0;
		while (number > 0) {
			result += number % 10;
			number /= 10;
		}
		return result;
	}

}
