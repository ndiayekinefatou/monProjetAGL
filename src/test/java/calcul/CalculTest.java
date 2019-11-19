package calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	private Calcul subject;
	
	@Before
	public void setup()
	{
		subject=new Calcul();
	}

	@Test
	public void testAddition() {
		assertEquals(8,subject.addition(6, 2));
	}

	@Test
	public void testMultiplication() {
		assertEquals(32,subject.multiplication(8, 4));
	}

	
}
