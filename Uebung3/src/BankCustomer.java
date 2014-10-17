
public class BankCustomer {
	private String vorname;
	private String name;
	private int alter;
	private String adresse;
	private BankManager manager;
	
	/**
	 * @param vorname
	 * @param name
	 * @param alter
	 * @param adresse
	 * @param manager
	 */
	public BankCustomer(String vorname, String name, int alter, String adresse, BankManager manager) {
		this.vorname = vorname;
		this.name = name;
		this.alter = alter;
		this.adresse = adresse;
		this.manager = manager;
	}


	public String toString() {
		return "BankCustomer [vorname=" + vorname + ", name=" + name
				+ ", alter=" + alter + ", adresse=" + adresse + ", manager="
				+ manager + "]";
	}
	
	public void print(){
		System.out.println(toString());
	}


	/**
	 * @return the manager
	 */
	public BankManager getManager() {
		return manager;
	}
	
	/*
	 * @param accountNo
	 */
	public BankAccount openNewAccount(long accountNo){
		return new BankAccount(accountNo, this);
	}
	

}
