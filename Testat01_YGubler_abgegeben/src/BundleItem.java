
public class BundleItem extends Item{
	private float discount;
	private String description;
	Item[] bundle;
	
	/**
	 * 
	 * @param bundle
	 * @param description
	 * @param discount
	 */
	public BundleItem(Item[] bundle, String description, float discount){
		super(description);
		this.bundle = bundle;
		this.description = description;
		this.discount = discount;
	}
		
	public void printItems(){
		
		for(Item item : bundle){
			item.print();
		}
	}
	
	public void print(){
		System.out.print("\nBundle: ");
		System.out.println(description + "\t\tRabatt:" + discount);
		printItems();
		System.out.println("\t\t\t\tZ-Total: " + getTotalPrice() + "\tRabatt: " + discount);
		System.out.println("\t\t\t\tTotal: " + getPrice());
	}
	
	public float getPrice(){
		return getTotalPrice() * ((100 - discount) / 100);
				
	}
	
	public float getTotalPrice(){
		float totalPrice = 0;
		for(Item item : bundle){
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

}
