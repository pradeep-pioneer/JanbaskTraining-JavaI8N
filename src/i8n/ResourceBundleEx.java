package i8n;

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
	public static void main(String[] args) {
		System.out.println("Bundles Example");
		bundleExample();
		System.out.println("Date Example");
		printDate(Locale.UK);
		printDate(Locale.US);
		printDate(Locale.FRANCE);

		System.out.println("Time Example");
		printTime(Locale.UK);
		printTime(Locale.US);
		printTime(Locale.FRANCE);

		System.out.println("Number Example");
		printNumber(Locale.UK);
		printNumber(Locale.US);
		printNumber(Locale.FRANCE);
		printNumber(Locale.JAPAN);
		
		System.out.println("Currency Example");
		printCurrency(Locale.UK);  
	    printCurrency(Locale.US);  
	    printCurrency(Locale.FRANCE);  
	}

	static void bundleExample() {
		String bundleName = "i8n.MessageBundle";
		ResourceBundle bundle = ResourceBundle.getBundle(bundleName, Locale.US);
		System.out.println("Message in " + Locale.US + ":" + bundle.getString("greeting"));

		// changing the default locale to indonasian
		Locale.setDefault(new Locale("in", "ID"));
		bundle = ResourceBundle.getBundle(bundleName);
		System.out.println("Message in " + Locale.getDefault() + ":" + bundle.getString("greeting"));

	}

	static void printDate(Locale locale) {
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		@SuppressWarnings("deprecation")
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date + " " + locale);
	}

	static void printTime(Locale locale) {
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String time = formatter.format(currentDate);
		System.out.println(time + " in locale " + locale);
	}

	static void printNumber(Locale locale) {
		double dbl = 105000.3245;
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number + " for the locale " + locale);
	}

	static void printCurrency(Locale locale) {
		double dbl = 10500.3245;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency + " for the locale " + locale);
	}
}
