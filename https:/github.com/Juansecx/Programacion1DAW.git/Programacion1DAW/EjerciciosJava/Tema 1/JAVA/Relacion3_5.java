
public class Relacion3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo = 199;
		int minimo = 100;
		int x;
		int suma = 0;
		System.out.println("50 numeros aleatorios entre 100 y 199");
		System.out.println("");
		for (int i = 0; i <= 50; i++) {

			x = (int) (Math.random() * 100) + 100;
			System.out.println(x + " ");
			suma += x;
			if (x > maximo) {
				maximo=x;
			}
			if (x<minimo) {
				minimo=x;
			}

		}
		
		System.out.println("Máximo de los los números generados aleatoriamente: " +maximo);
		System.out.println("Mínimo de los los números generados aleatoriamente: " +minimo);
		System.out.print("Suma de los los números generados aleatoriamente: " +suma);
	}

}
