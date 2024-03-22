package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	void testIsArithmeticExpression() {
		assertTrue(Validations.isArithmeticExpression(" ( ( 2.2-1 ) + 3 )"));
		assertTrue(Validations.isArithmeticExpression("(((2 +(1)*(3"));
		assertTrue(Validations.isArithmeticExpression("1-3"));
		assertFalse(Validations.isArithmeticExpression("2 +() 3"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc12))*2"));
		assertFalse(Validations.isArithmeticExpression("20.5 ) + abc12))*2"));
	}
}
