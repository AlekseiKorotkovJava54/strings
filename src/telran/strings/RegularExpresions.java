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
		//TODO
		//string 1-3 simbol presenting number 0(00)(000)-255 
		return null;
	}
	
}
