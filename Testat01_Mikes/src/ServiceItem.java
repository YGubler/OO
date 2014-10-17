
public class ServiceItem extends Item {
	private float price;
	
	ServiceItem(float price, String description){
		super(description);
		//
		this.price = price;
	}
	
	float getPrice(){
		return price;
	}
}
