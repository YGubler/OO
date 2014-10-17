
public class Item {
	String description;
	
	/**
	 * 
	 * @param description
	 */
	Item(String description){
		this.description = description;
	}
	
	float getPrice(){
		return 0;
	}
	
	String print(boolean bundle){
		return Format.rpad(description, (bundle ? 22 : 35)) + Format.lpad(Format.getFormatedPrice(getPrice()),10);
	}
	
	
}
