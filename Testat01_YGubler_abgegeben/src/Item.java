

public class Item {
	private String description;
	
	
	
	/**
	 * @param description
	 */
	public Item(String description) {
		this.description = description;
	}

	//dient dazu, dass man Item.getPrice() aufrufen kann. Anhand der übergebenen Parameter wird dann die entsprechende Methode der entsprechenden Subklasse aufgerufen.
	public float getPrice(){
		return 0;
	}
	
	void print(){
		System.out.print("Artikel: " + description +"\t\tPreis: " + Math.round(getPrice() * 100f) / 100f);
	}
	

}
