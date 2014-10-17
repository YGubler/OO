
public class Aufgabe2_StackDatenstruktur_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objekte (Strings) für Stack erzeugen
		String element1 = new String("Hallo World!");
		String element2 = new String("Hallo Schweiz!");
		String element3 = new String("Hallo Rapperswil!");
		String element4 = new String("Hallo HSR!");
		String element5 = new String("Hallo 3.008!");
		String element6 = new String("Hallo hinterste Reihe!");
		
		//Stack mit einer maxGrösse von 10
		Aufgabe2_StackDatenstruktur stack1 = new Aufgabe2_StackDatenstruktur(6);
		
		//Objekte auf Stack legen
		stack1.push(element1);
		stack1.push(element2);
		stack1.push(element3);
		stack1.push(element4);
		stack1.push(element5);
		stack1.push(element6);
		System.out.println("Stack-Size:\t" + stack1.size() + "\n\n");
		
		//Objekte von Stack holen
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println("Stack-Size:\t" + stack1.size() + "\n");
		
		//Peek - Referenz des obersten Objekt auf dem Stack
		System.out.println(stack1.peak());
		System.out.println(stack1.peak());
		System.out.println(stack1.pop());
		System.out.println(stack1.peak());
	}

}
