package aufgabe5_DatumsKonversion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DateConverser {
	
	public static void converseDate(){
		Pattern pattern = Pattern.compile(""
				+ "(?<WEEKDAY>(Mon|Tue|Wed|Thu|Fri|Sat|Sun))"
				+ "\\s"
				+ "(?<MONTH>[0-1]?[0-9])"
				+ "/"
				+ "(?<DAY>[0-9]?[0-9])"
				+ "/"
				+ "(?<YEAR>[0-9]?[0-9]?[0-9]?[0-9])"
				+ "\\s"
				+ "(?<HOUR>[0-1]?[0-9])"
				+ ":"
				+ "(?<MINUTES>[0-5][0-9])"
				+ "\\s"
				+ "(?<MERIDIEM>(AM|PM))"
		);
		
		Matcher matcher = pattern.matcher(dateFromConsole());
		if(matcher.matches()){
			String weekday = matcher.group("WEEKDAY");
			String month = matcher.group("MONTH");
			String day = matcher.group("DAY");
			String year = matcher.group("YEAR");
			int hour = Integer.parseInt(matcher.group("HOUR"));
			String minutes = matcher.group("MINUTES");
			String meridiem = matcher.group("MERIDIEM");
			
			String weekdayDE = null;
			switch (weekday){
				case "Mon": 
					weekdayDE = "Mo";
					break;
				case "Tue": 
					weekdayDE = "Di";
					break;
				case "Wed":
					weekdayDE = "Mi";
					break;
				case "Thu":
					weekdayDE = "Do";
					break;
				case "Fri":
					weekdayDE = "Fr";
					break;
				case "Sat":
					weekdayDE = "Sa";
					break;
				case "Sun":
					weekdayDE = "So";
					break;
			}
			
			if(meridiem.equals("PM")){
				hour += 12;
			}else{
				if(hour == 12){
					hour = 0;
				}
			}
			
			System.out.println(weekdayDE + " " + day + "." + month + "." + year + " " + hour + ":" + minutes);
		}else{
			System.err.println("Sie haben ein falsches Datumsformat eingegeben.\nGeben sie nochmals ein Datum ein");
			converseDate();
		}
	}
	
	public static String dateFromConsole(){
		Scanner scanner = new Scanner(System.in);
		String dateFromConsole = scanner.nextLine();
		return dateFromConsole;
	}
	

}
