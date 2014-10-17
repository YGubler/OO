public class BankAccount {
	final private long kontoNr;
	private double kontoStand;
	private BankCustomer accEigentuemer;

	public long getKontoNr() {
		return kontoNr;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public BankAccount(long kontoNr, BankCustomer accEigentuemer) {
		this.kontoNr = kontoNr;
		this.accEigentuemer = accEigentuemer;
	}

	public void deposit(double betrag) {
		this.kontoStand += betrag;
	}

	public boolean widthdraw(double abheben) {
		if (this.kontoStand >= abheben) {
			this.kontoStand -= abheben;
			return true;
		} else {
			System.err.println("Betrag nicht verfügbar");
			return false;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [kontoNr=" + kontoNr + ", kontoStand=" + kontoStand
				+ ", accEigentuemer=" + accEigentuemer + "]";
	}

	public void print() {
		System.out.println(toString());
	}
	
	//Prüft ob das Konto other vom selben Kunden als dieses Konto ist
	public boolean sameCustomer(BankAccount other){
		if (other.accEigentuemer == this.accEigentuemer){
			return true;
		}else return false;
	}
	
	public BankManager getManager(){
		return this.accEigentuemer.getManager();
	}
}