package aufgabe4_PrimzahlenStrahl;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;


class Main {
	
	public static ArrayList<Integer> cachedPrimes = new ArrayList<Integer>();
	public static int target;
	
	public static void addNewPrime(int prime){
		//System.out.println("Cache Prime: " + prime);
		cachedPrimes.add(prime);
//		System.out.println("Size: " + cachedPrimes.size() + " / Target: " + target);
		if(((double)cachedPrimes.size() / target * 100) % 10 == 0){
			System.out.println((int)((double)cachedPrimes.size() / target * 100) + "%");
		}
	}
	
    public static void main(String[] args) {    
    	long start = 0L;
    	int startPoint = 2;
    	while(true){
    		System.out.println("Welche Primzahl?");
            int limit = numFromConsole();
            start = System.currentTimeMillis();
            if(limit <= cachedPrimes.size()){
            	System.out.println("Already cached!");
            	System.err.println(cachedPrimes.get(limit-1));
            } else {
            	System.out.println("Not yet cached.. start caching start from prime: " + startPoint + "...");
            	//
            	target = limit;
            	
            	// Primzahl noch nicht gecached weiter streamen
            	IntStream
                .iterate(startPoint, i -> i+1)
                .filter(Main::isPrime)
                .limit(limit - cachedPrimes.size())
                .forEach(Main::addNewPrime);
            	
            	startPoint = cachedPrimes.get(limit-1)+1;
            	// Neu ist die gesuchte Zahl am Schluss
            	System.err.println(cachedPrimes.get(limit-1) + "\n");
            }
            System.out.println("Time used: " + (System.currentTimeMillis() - start) + "ms\n");
            
		   
    	}
    	
    }
 
    public static boolean isPrime(int n) {
        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }
     
    public static int numFromConsole(){
        Scanner numFromConsole = new Scanner(System.in);
        int num = numFromConsole.nextInt();
        //numFromConsole.close();
        return num;
    }
	
	
	
	
//	static ArrayList<Integer> primeList = new ArrayList<Integer>();
//
//	public static void main(String[] args) {	
//		System.out.println("Wie viele Primzahlen sollen berechnet werden?: ");
//		final int anzPrime = numFromConsole();
//		
//		System.out.println("Die wievielte Primzahl möchten Sie wissen?: ");
//		
//		
//	
//		
////		ArrayList<Integer> primeList = 
////		(ArrayList<Integer>)
//		IntStream
//		.iterate(2, i -> i+1)
////		.limit(100000)
//		.filter(Main::ifPrime)
//		.limit(anzPrime)
////		.skip(anzPrime-1)
////		.findFirst()
////		.boxed()
////		.collect(Collectors.toList());
//		.forEach(Main::addArrayList);
//		
//		
//		System.out.println(getPrimeAt(primeList, numFromConsole()));
//				
////		int count = 0, maxTries = 3;
////		while(true){
////			try{
////				System.out.println("Die wievielte Primzahl möchten Sie wissen?: ");
////				System.out.println(getPrimeAt(primeList, numFromConsole()));
////			}catch (Exception e) {
////				System.err.println("aktuelle ArrayListlänge zu kurz: " + primeList.size());
////				if (++count == maxTries) System.out.println("Anzahl Versuche erreicht");;
////			}
////		}
//	
//		
////		IntStream
////		.iterate(2, i -> i+1)
////		.limit(10000)
////		.filter(Main::ifPrime)
////		.forEach(System.out::println);
//		
//
//	}
//	
//	public static void addArrayList(int prime){
//		primeList.add(prime);
////		System.out.println("huhu");
//	}
//
//	public static boolean ifPrime(int n) {
//		if (n >= 2) {
//			for (int i = 2; i < n; i++) {
//				if (n % i == 0)
//					return false;
//			}
//			return true;
//		} else
//			return false;
//	}
//	
//	public static int numFromConsole(){
//		System.out.println("test num");
//		Scanner numFromConsole = new Scanner(System.in);
//		int num = numFromConsole.nextInt();
////		numFromConsole.close();
//		return num;
//	}
//	
//	public static int getPrimeAt(ArrayList<Integer> primeList, int num){
//		return primeList.get(num - 1);
//	}
}

