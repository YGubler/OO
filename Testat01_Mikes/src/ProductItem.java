/**
 * 
 * @author janicmikes
 * @
 */
public class ProductItem extends Item {
	private int amount;
	private float pricePerUnit;
	
	/**
	 * 
	 * @param amount The amount of this Product
	 * @param pricePerUnit The product price for one piece
	 * @param description An item description
	 */
	ProductItem(int amount, float pricePerUnit, String description){
		super(description);
		//
		this.amount = amount;
		this.pricePerUnit = pricePerUnit;
	}
	
	float getPrice(){
		return amount * pricePerUnit;
	}
	
	String getDetailInformation(){
		if(amount > 1){
			return "\n     " + Format.rpad(amount + " x " + Format.getFormatedPrice(pricePerUnit),33);
		} else {
			return "";
		}
	}
	
	String print(boolean bundle){
		return super.print(bundle) + getDetailInformation();
	}
}
