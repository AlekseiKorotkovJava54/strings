package telran.strings;

public class RegularExpresions {
	public static String javaVariable() {
		String regex = "([A-Za-z$][A-Za-z0-9_$]*|_[A-Za-z0-9_$]+)";
		// String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		return regex;
	}
	public static String zero_300() {
		String regex = "([1-9]\\d?|[1-2]\\d\\d|300|0)";
		return regex;
	}
	public static String ipOctet() {
		String regex = "(2[0-5][0-5]|2[0-4][0-9]|[0-1]\\d\\d|[0-9]\\d?)";
		//"([0-1]?\\d{1,2}|2([0-4]\\d|5[0-5]))"
		return regex;
	}
	public static String mobileIsraelPhone() {
		String regex = "((\\+972-|0)5\\d-?\\d\\d\\d-?\\d\\d-?\\d\\d)";
		return regex;
	}
	public static String ipV4Address() {
		String ipOctetExpr = ipOctet();
		return String.format("%1$s(\\.%1$s){3}", ipOctetExpr);
		// return String.format("%s(\\.%s){3}", ipOctetExpr, ipOctetExpr);
	}
	public static String simpleArithmeticExpression() {
		// +-*/
		//int
		//no ()
		String operand = integerNumberExp();
		String operation = operationExp();
		return String.format("%1$s(%2$s%1$s)*", operand, operation);
	}
	private static String operationExp() {
		return "[-+*/]";
		// return "[+\\-*/]";
	}
	private static String integerNumberExp() {
		return "(\\s*\\d+\\s*)";
	}
	public static String arithmeticExpression() {
		return null;
	}
}
