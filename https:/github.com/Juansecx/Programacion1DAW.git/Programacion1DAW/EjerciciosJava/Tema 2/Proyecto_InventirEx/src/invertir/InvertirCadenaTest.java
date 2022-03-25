package invertir;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class InvertirCadenaTest {

	@Test
	void testInvertir() {
		InvertirCadena sd = new InvertirCadena("Manolete");
		String resul= sd.invertir();
		assertEquals("etelonaM", resul);
	}

}
