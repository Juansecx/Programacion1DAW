import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
;

@RunWith(Parameterized.class)

public class CuentaImparesTest3 {

	private int num;
	private int resul;

	public CuentaImparesTest3(int num, int resul) {
		this.num = num;
		this.resul = resul;
	}

	@Parameters

	public static Collection<Object[]> cuentaImpares() {
		
		final java.util.List<Object[]> result = new ArrayList<Object[]>();

		result.add(new Object[] { 3, 2 });
		result.add(new Object[] { 5, 3 });
		result.add(new Object[] { 8, 4 });
		return result;
	}
	
	@Test
	public void testimpar3() {
		
		CuentaImpares1 cuenta = new CuentaImpares1(num);
		int res = cuenta.cuentaImpares();
		assertEquals(resul,res);
	}
}
