
public class ServiceItem extends Item {
	
	private float price;
	
	/**
	 * 
	 * @param description
	 * @param price
	 */
	public ServiceItem(String description, float price){
		super(description);
		this.price = price;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void print(){
		super.print();
		System.out.println("");
	}

}
