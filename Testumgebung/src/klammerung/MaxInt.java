package klammerung;


class MaxInt {
	enum Degree{A, B, C};

	public static void main(String[] args) {
		int[] series = {-2,-2,-1,0,1,1,1,5,5,22,444};
		System.out.println(max(series));
		revert(series);
//		System.out.println(Arrays.toString(series));
		System.out.println(countDuplicates(series));
		
		boolean c = false;
		System.out.println(c);
		
		double a = 0.3;
		double b = 0.1 + 0.1 + 0.1;
		System.out.println(Double.compare(a, b));
		 Float f = 0.1f;
		 System.out.println(f/0);
		
		int i = 10 / 6;
		System.out.println(i);
		
		System.out.println(series[1]);
		
		
		

	}

	public static int max(int[] series) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < series.length; i++) {
			if (series[i] > max) {
				max = series[i];
			}
		}
		return max;
	}

	public static void revert(int[] series) {
		for (int i = 0; i < series.length / 2; i++) {
			int j = series.length - 1 - i;
			int t = series[i];
			series[i] = series[j];
			series[j] = t;
		}
	}
	
	public static int countDuplicates(int[] series){
		int count = 0;
		for (int i = 1; i < series.length; i++){
			if(series[i] == series [i-1]){
				++count;;
				while(i < series.length && series[i] == series[i-1]){
					i++;
				}
			}
		}
		return count;
	}

}
