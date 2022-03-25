package MATES;

public class funcionesmatematicas {
	
	public static int digito(int x) {

		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10;
				n++;
			}
			return n;
		}

	}
	
	

}
