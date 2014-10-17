
public class Main {

	public static void main(String[] args) {
		// Create some product items
		ProductItem pi1 = new ProductItem(1, 4.235f, "CD Rohling");
		ProductItem pi2 = new ProductItem(5, 1.5f, "Kugelschreiber rot");
		
		// Create a service item
		ServiceItem si1 = new ServiceItem(20.15f, "Lieferung");
		
		// Create a bundle
		ProductItem pi3 = new ProductItem(5, 1.5f, "Kugelschreiber rot");
		ProductItem pi4 = new ProductItem(5, 1.5f, "Kugelschreiber blau");
		BundleItem bi1 = new BundleItem("Stiftebundle", 20, new Item[]{pi3, pi4});
		
		// Create an order 
		Order o1 = new Order(new Item[]{pi1, pi2, bi1, si1});
		
		// Print out the order with a hading and a footer which contains the total price of the order
		System.out.println("Bestellung                                CHF\n---------------------------------------------");
		System.out.print(o1.printItems());
		System.out.print("---------------------------------------------" + "\n" + Format.rpad("TOTAL", 40) + Format.getFormatedPrice(o1.getTotalPrice()));
			
	}

}
