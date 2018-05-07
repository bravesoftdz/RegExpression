package by.gvozdev.regextraining;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gvozdev Alexander May 7, 2018
 */

public class TestRegularExpression {

	static final String text = "Белорусь - красивая страна. Многие люди посещают Белорусь каждый год.";

	public static boolean checkName(String name) {
		Pattern pattern = Pattern.compile("^Ivan$"); // create regex
		Matcher matcher = pattern.matcher(name); // create rule to formal parameters
		return matcher.matches(); // return result conformity string with rule
	}

	public static void checkNameCountry() {
		System.err.println(text.replaceAll("[Бб]ел[оа]русь", "Беларусь"));
	}
	
	public static boolean checkDomain(String domain) {
		Pattern pattern = Pattern.compile(".+\\.(com|by|org|ua)"); // create regex
		Matcher matcher = pattern.matcher(domain); // create rule to formal parameters
		return matcher.matches(); // return result conformity string with rule
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test1
		System.out.println(checkName("Ivan")); // true
		System.out.println(checkName("ivan")); // false
		// test 2
		checkNameCountry();
		// test3
		System.out.println(checkDomain("google.com"));
		System.out.println(checkDomain("tut.by"));
		System.out.println(checkDomain("mail.ru"));
		System.out.println(checkDomain("rbc.ua"));


	}

}
