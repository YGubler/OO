
public class Order {
	
	private Item[] order;
	
	
	/**
	 * 
	 * @param order
	 */
	public Order(Item[] order){
		this.order = order;
	}
	
	public float getTotalPrice(){
		float totalPrice = 0;
		for(Item item : order){
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	public void printItems(){
		System.out.println("\nBestellung:");
		for(Item item : order){
			item.print();
		}
		
	}

}
