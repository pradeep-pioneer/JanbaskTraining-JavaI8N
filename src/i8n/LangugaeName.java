package i8n;

import java.util.Locale;

public class LangugaeName {
	public static void main(String[] args) {
		System.out.println("***French Language Example****");
		frenchExample();
		System.out.println("***Multi Language Example****");
		multiLanguageExample();
	}

	static void frenchExample() {
		Locale enLocale = new Locale("en", "US");
		Locale frLocale = new Locale("fr", "FR");
		Locale esLocale = new Locale("es", "ES");
		System.out.println("English language name (default): " + enLocale.getDisplayLanguage());

		System.out.println("English language name in French: " + enLocale.getDisplayLanguage(frLocale));
		System.out.println("English language name in spanish: " + enLocale.getDisplayLanguage(esLocale));
	}

	static void multiLanguageExample() {
		Locale[] locales = { new Locale("en", "US"), new Locale("es", "ES"), new Locale("it", "IT") };

		for (int i = 0; i < locales.length; i++) {
			String displayLanguage = locales[i].getDisplayLanguage(locales[i]);
			System.out.println(locales[i].toString() + ": " + displayLanguage);
		}
	}
}
