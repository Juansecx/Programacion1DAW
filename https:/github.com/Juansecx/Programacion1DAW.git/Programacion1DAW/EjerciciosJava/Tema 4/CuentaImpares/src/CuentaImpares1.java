
public class CuentaImpares1 {

	private int num;

	public CuentaImpares1() {

	}

	public CuentaImpares1(int n) {

		num = n;
	}

	public int cuentaImpares() {

		int cuenta = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				cuenta++;
			}
		}
		return cuenta;
	}

}
