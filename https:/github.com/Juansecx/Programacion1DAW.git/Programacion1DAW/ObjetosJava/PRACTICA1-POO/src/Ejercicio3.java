
public class Ejercicio3 {

	private int cont;

	public Ejercicio3() {

	}

	public Ejercicio3(int cont) {

		this.cont = cont;

		if (cont < 0) {

			cont = 0;
		}

	}
	
	public Ejercicio3 (final Ejercicio3 c) {
		
		cont=c.cont;
		
	}
	
	public void Incrementar() {
		cont++;
	}
	
	public void  Decrementar() {
		
		if (cont-1==0       ) {
			cont=0;
		}else {
			cont--;
		}
	}
		
 
	
	

//getter
	public int getCont() {
		return cont;
	}

//setter
	public void setCont(int cont) {
		this.cont = cont;
	}
}
