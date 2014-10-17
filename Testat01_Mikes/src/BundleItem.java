
public class BundleItem extends Item{
	private int discount;
	Item[] bundledItems;
	
	// Standardablauf:
	BundleItem(String itemDescription, int discount, Item[] bundledItems){
		super(itemDescription);
		this.discount = discount;
		this.bundledItems = bundledItems;
	}
	
	@Override
	float getPrice(){
		float totalPrice = getTotalPrice();
		totalPrice -= getDiscount(totalPrice);
		return totalPrice;
	}
	
	String getDetailInformation(){
		StringBuilder bundle = new StringBuilder();
		for(Item item : bundledItems){
			bundle.append("\n" + " - " + item.print(true));
//			bundle.append("\n" + " - " + Format.rpad(item.description, 25) + Format.lpad(Format.getFormatedPrice(item.getPrice()),8));
		}
		bundle.append("\n - " + Format.rpad("Discount (-" + Integer.toString(discount)  + "%)", 22) + Format.lpad(Format.getFormatedPrice(getDiscount(getTotalPrice()) * -1),10));
		return bundle.toString();
	}
	
	String print(boolean bundle){
		return super.print(false) + getDetailInformation();
	}
	
	float getDiscount(float totalPrice){
		return totalPrice * discount / 100;
	}
	
	float getTotalPrice(){
		float totalPrice = 0;
		for(Item item : bundledItems){
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
}
