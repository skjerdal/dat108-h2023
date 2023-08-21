package no.hvl.dat108.enhetstesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinStabelTest {
	
	private Stabel<Integer> s;
	
	@BeforeEach void nullstill() {
		s = new MinStabel<>();
	}
	
	@Test void peekPaaTomStabelSkalGiNull() {
		assertNull(s.peek());
	}
	
	@Test void popPaaTomStabelSkalGiNull() {
		assertNull(s.pop());
	}
	
	@Test void sisteSkalVarePaaTopp() {
		s.push(3);
		assertEquals(3, s.peek());
		s.push(7);
		assertEquals(7, s.peek());
	}
	
	@Test void fjerningVirkerSomForventet() {
		s.push(3);
		s.push(7);
		s.push(2);
		
		int fjernet = s.pop();
		assertEquals(2, fjernet);
		assertEquals(7, s.peek());
		
		fjernet = s.pop();
		assertEquals(7, fjernet);
		assertEquals(3, s.peek());
		
		fjernet = s.pop();
		assertEquals(3, fjernet);
	}
}
