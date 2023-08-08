package no.hvl.dat108;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HalloTest {

	@Test
	void test() {
		assertEquals("Hallo Per!", Hallo.siHalloTil("Per"));
	}

}
