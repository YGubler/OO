
public class Order {
	// Alternatively an ArrayList could be used, this would be useful when planing to add new Items at runtime
	Item[] items;
	
	Order(Item[] items){
		this.items = items;
	}
	
	float getTotalPrice(){
		float totalPrice = 0;
		for(Item item : items){
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	String printItems(){
		StringBuilder strItems = new StringBuilder();
		for(Item item : items){
			strItems.append(item.print(false) + "\n");
		}
		return strItems.toString();
	}
}
