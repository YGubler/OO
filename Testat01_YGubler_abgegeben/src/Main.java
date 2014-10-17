
public class Main {

	public static void main(String[] args) {
		//Create new ProductItems
		ProductItem pi1 = new ProductItem(2, 2.65f, "Stabilo");
		ProductItem pi2 = new ProductItem(3, .90f, "Ereaser");
		
		//Create new ServiceItems
		ServiceItem si1 = new ServiceItem("Roomcleaning", 50);
		ServiceItem si2 = new ServiceItem("PC-Repear", 120);
				
		//Print ProductItems
		System.out.println("\nProductItems");
		pi1.print();
		pi2.print();
		
		//Print ServiceItems
		System.out.println("\nServiceItems");
		si1.print();
		si2.print();
		
		//Create new Order
		Order o1 = new Order(new Item[]{si1, si2, pi1});
		
		//Print Order
		o1.printItems();
		
		//Print OrderPrice
		System.out.println("\t\t\t\tTotal: " + o1.getTotalPrice());
		
		//Create BundleItem
		BundleItem bi1 = new BundleItem(new Item[]{si1, pi2}, "Rabattbundle", 40);
		BundleItem bi2 = new BundleItem(new Item[]{si2, pi1}, "zweiter B", 30);
		BundleItem bi3 = new BundleItem(new Item[]{bi1, bi2}, "Bundleverb", 20);
		
		//Print BundleItem
		bi1.print();
		bi2.print();
		bi3.print();

	}

}
