
public class Fracciones {

	private int num;
	private int den;

	public Fracciones() {
		this.num = 0;
		this.den = 1;
	}

	public Fracciones(int num) {
		this.num = num;
		this.den = 1;
	}

	public Fracciones(int num, int den) {
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	private int mcd() {

		int u = Math.abs(num);
		int v = Math.abs(den);

		if (v == 0) {
			return u;

		}
		int r;
		while (v != 0) {

			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public Fracciones Fracciones(Fracciones f) {

		Fracciones aux = new Fracciones();

		aux.num = num * f.den + den * f.num;
		aux.den = den * f.den;

		return aux;
	}

	public Fracciones sumar(Fracciones x) {
		Fracciones aux = new Fracciones(); // fracción para guardar la suma
		aux.num = this.num * x.den + this.den * x.num;
		aux.den = this.den * x.den;
		aux.Simplificar();
		return aux;
	}

	public Fracciones restar(Fracciones x) {
		Fracciones aux = new Fracciones(); // fracción para guardar la suma
		aux.num = this.num * x.den - this.den * x.num;
		aux.den = this.den * x.den;
		aux.Simplificar();
		return aux;
	}

	public Fracciones multiplicar(Fracciones x) {
		Fracciones aux = new Fracciones(); // fracción para guardar la suma
		aux.num = this.num * x.num;
		aux.den = this.den * x.den;
		aux.Simplificar();
		return aux;
	}

	public Fracciones division(Fracciones x) {
		Fracciones aux = new Fracciones(); // fracción para guardar la suma
		aux.num = this.num * x.den;
		aux.den = this.den * x.num;
		aux.Simplificar();
		return aux;
	}

	public void Simplificar() {

		int divisorMax = mcd();

		this.num = num / divisorMax;
		this.den = den / divisorMax;

	}
	
	

}
