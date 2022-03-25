import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CuentaImpares2Test {
	
	CuentaImpares1 cuenta;
	
	public void creObjeto() {
		
	cuenta  = new CuentaImpares1(10);
	
	}
	

	@Test
	
	public void testCuentaImpares() {		
		int resul= cuenta.cuentaImpares();
		assertEquals(5, resul);
	}

}
