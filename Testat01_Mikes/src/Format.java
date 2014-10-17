import java.text.DecimalFormat;


public class Format {
	public static String getFormatedPrice(double price){
		// Round to 0.05 swiss francs
		float realPrice = Math.round(20 * price) / 20f;
		
		// Format price with one 0 before the comma and two after (1 -> 1.00 / .3 -> 0.03)
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		// return the formated float as String
		return decimalFormat.format(realPrice);
	}
	
	// pad and trim a given String at a certain position on the left side
	public static String lpad(String s, int pad){
		return String.format("%1$" + pad + "s", s).substring(0, pad);
	}
	
	// pad and trim a given String at a certain position on the right side
	public static String rpad(String s, int pad){
		return String.format("%1$-" + pad + "s", s).substring(0, pad);
	}
}
