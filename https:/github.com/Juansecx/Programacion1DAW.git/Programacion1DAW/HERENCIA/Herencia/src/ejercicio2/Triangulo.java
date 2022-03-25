package ejercicio2;

public class Triangulo  extends Poligono{
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo( int lado1, int lado2, int lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	
	@Override
	public String toString() {
		
		return "Triangulo: \n" + super.toString()+ "\nlado1 " +lado1+ "\nlado2 " +lado2+ "lado3 " +lado3;
	}
	
	
	public  double area() {

		double h;
		double aux;
		double raiz;

		h = Math.pow(lado1, 2) + Math.pow(lado2, 2);

		raiz = Math.sqrt(h);
		
		aux=(lado1*raiz)/2;

		return aux;
	}
	
	
	
	

}
