package telran.strings;

public class RegularExpresions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][A-Za-z0-9_$]*|_[A-Za-z0-9_$]+";
		// String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		return regex;
	}
	public static String zero_300() {
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		return regex;
	}
	public static String ipOctet() {
		String regex = "2[0-5][0-5]|2[0-4][0-9]|[0-1]\\d\\d|[0-9]\\d?";
		return regex;
	}
	public static String mobileIsraelPhone() {
		String regex = "(\\+972-|0)5\\d-?\\d\\d\\d-?\\d\\d-?\\d\\d";
		return regex;
	}
}
