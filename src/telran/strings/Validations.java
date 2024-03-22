package telran.strings;

public class Validations {
public static boolean isArithmeticExpression(String expression) {
	String regex = RegularExpresions.arithmeticExpression();
	boolean isMatch = expression.matches(regex);
	return isMatch && isBracketsCorrect(expression);
}
public static boolean isBracketsCorrect(String expression) {
	int count = 0;
	char[] chars = expression.toCharArray();
	for(int i=0; i<chars.length && count>-1; i++) {
		if(chars[i] == '(') count +=1;
		if(chars[i] == ')') count -=1;
	}
	return count<0 ? false:true;
}
}
