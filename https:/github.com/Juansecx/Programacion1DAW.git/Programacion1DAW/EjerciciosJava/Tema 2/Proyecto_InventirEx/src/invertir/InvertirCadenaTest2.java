package invertir;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)


public class InvertirCadenaTest2 {

	public InvertirCadenaTest2(String cadena, String resul) {
		super();
		this.cadena = cadena;
		this.resul = resul;
	}

	private String cadena;
	private String resul;

	@Parameters
	public static Collection<Object[]> invertir() {

		final java.util.List<Object[]> result = new ArrayList<Object[]>();

		result.add(new Object[] { "Juanito", "otinauJ" });
		result.add(new Object[] { "mUrCiElAgO", "oGaLeIcRuM" });

		return result;
	}

	@Test
	public void testInvertir() {
		InvertirCadena test = new InvertirCadena(cadena);
		String result = test.invertir();
		assertEquals(resul, result);
	}

}
