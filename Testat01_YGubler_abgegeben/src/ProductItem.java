
public class ProductItem extends Item {
	
	private int amount;
	private float pricePerUnit;
	
	/**
	 * 
	 * @param amount
	 * @param pricePerUnit
	 * @param description
	 */
	public ProductItem(int amount, float pricePerUnit, String description){
		super(description);
		this.amount = amount;
		this.pricePerUnit = pricePerUnit;
	}
	
	public float getPrice(){
		return amount * pricePerUnit;
	}
	
	public void print(){
		super.print();
		System.out.println("\tAnzahl: " + amount + "\tStückpreis: " + pricePerUnit);
	}

}