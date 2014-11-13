package aufgabe4_PrimzahlenStrahl;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Main {
	
	static ArrayList<Integer> primeList = new ArrayList<Integer>();

	public static void main(String[] args) {	
		System.out.println("Wie viele Primzahlen sollen berechnet werden?: ");
		final int anzPrime = numFromConsole();
		
		System.out.println("Die wievielte Primzahl möchten Sie wissen?: ");
		
		
	
		
//		ArrayList<Integer> primeList = 
//		(ArrayList<Integer>)
		IntStream
		.iterate(2, i -> i+1)
//		.limit(100000)
		.filter(Main::ifPrime)
		.limit(anzPrime)
//		.skip(anzPrime-1)
//		.findFirst()
//		.boxed()
//		.collect(Collectors.toList());
		.forEach(Main::addArrayList);
		
		
		System.out.println(getPrimeAt(primeList, numFromConsole()));
				
//		int count = 0, maxTries = 3;
//		while(true){
//			try{
//				System.out.println("Die wievielte Primzahl möchten Sie wissen?: ");
//				System.out.println(getPrimeAt(primeList, numFromConsole()));
//			}catch (Exception e) {
//				System.err.println("aktuelle ArrayListlänge zu kurz: " + primeList.size());
//				if (++count == maxTries) System.out.println("Anzahl Versuche erreicht");;
//			}
//		}
	
		
//		IntStream
//		.iterate(2, i -> i+1)
//		.limit(10000)
//		.filter(Main::ifPrime)
//		.forEach(System.out::println);
		

	}
	
	public static void addArrayList(int prime){
		primeList.add(prime);
//		System.out.println("huhu");
	}

	public static boolean ifPrime(int n) {
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
		System.out.println("test num");
		Scanner numFromConsole = new Scanner(System.in);
		int num = numFromConsole.nextInt();
//		numFromConsole.close();
		return num;
	}
	
	public static int getPrimeAt(ArrayList<Integer> primeList, int num){
		return primeList.get(num - 1);
	}
}

