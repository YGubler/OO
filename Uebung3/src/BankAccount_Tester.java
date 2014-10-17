
public class BankAccount_Tester {

	public static void main(String[] args) {
		//Bank Manager erstellen
		BankManager katheSmith = new BankManager("Kate Smith", 1);
		BankManager uweSchnell = new BankManager("Uwe Schnell", 2);
		
		//BankCostumer erstellen
		BankCustomer klaraMeier = new BankCustomer("Klare", "Meier", 40, "Mühlebachstrasse 2", katheSmith);
		BankCustomer petraMueller = new BankCustomer("Petra", "Müller", 35, "Firststreet 2", katheSmith);
		BankCustomer hansMeier = new BankCustomer("Hans", "Meier", 33, "Langstrasse 3", uweSchnell);
		BankCustomer stefanSchmid = new BankCustomer("Stefan", "Schmid", 22, "Musterstrasse 8", uweSchnell);
		
			
		//BankAccount erstellen
		BankAccount acc1 = new BankAccount(1, klaraMeier);
		BankAccount acc2 = new BankAccount(2, klaraMeier);
		BankAccount acc3 = new BankAccount(3, petraMueller);
		BankAccount acc4 = new BankAccount(4, hansMeier);
		BankAccount acc5 = new BankAccount(5, stefanSchmid);
		
		//Neuer Account
		klaraMeier.openNewAccount(1);
		klaraMeier.openNewAccount(2);
		petraMueller.openNewAccount(3);
		hansMeier.openNewAccount(4);
		stefanSchmid.openNewAccount(5);
		
		
		//Kontostände und Transaktionen überprüfen
		System.out.println("KontoNr: " + acc1.getKontoNr() + "\tKontostand: " + acc1.getKontoStand());
		
		acc2.deposit(1000);
		System.out.println("KontoNr: " + acc2.getKontoNr() + "\tKontostand: " + acc2.getKontoStand());
		
		acc3.deposit(100000);
		System.out.println("KontoNr: " + acc3.getKontoNr() + "\tKontostand: " + acc3.getKontoStand());
		acc3.widthdraw(999);
		System.out.println("KontoNr: " + acc3.getKontoNr() + "\tKontostand: " + acc3.getKontoStand());
		acc3.widthdraw(9999999);
		System.out.println("KontoNr: " + acc3.getKontoNr() + "\tKontostand: " + acc3.getKontoStand());
		
		//alle Accounts mit allen Daten printen
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		
		//Prüft ob das Konto other vom selben Kunden als dieses Konto ist
		System.out.println("\n" + acc1.sameCustomer(acc2));
		System.out.println(acc2.sameCustomer(acc3));
		
		//Manger des Kunden dieses Kontos zurückgeben
		System.out.println("\n" + acc1.getManager());
		System.out.println(acc4.getManager());
		


	}

}
