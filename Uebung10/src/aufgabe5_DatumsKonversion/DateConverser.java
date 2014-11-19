package aufgabe5_DatumsKonversion;

import java.util.regex.Pattern;

class DateConverser {
	
	public static void converseDate(String dateEng){
		Pattern pattern = Pattern.compile("(?<WEEKDAY>(Mon|Tue|Wed|Thu|Fri|Sat|Sun))\\s(?<MONTH>[0-1]?[0-9])/(?<DAY>[0-9]?[0-9])/(?<YEAR>[0-9]?[0-9]?[0-9]?[0-9])\\s(?<HOUR>[0-1]?[0-9]):(?<MINUTES>[0-5][0-9])\\s(?<MERIDIEM>(AM|PM))");
	}
	

}
