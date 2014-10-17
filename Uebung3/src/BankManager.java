
public class BankManager {
	private String name;
	private int managerID;
	
	
	/**
	 * @param name
	 * @param managerID
	 */
	public BankManager(String name, int managerID) {
		this.name = name;
		this.managerID = managerID;
	}


	public String toString() {
		return "BankManager [name=" + name + ", managerID=" + managerID + "]";
	}
	
	public void print(){
		System.out.println(toString());
	}
	
	
}
