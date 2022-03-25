
public class MainFracciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fracciones f1 = new Fracciones(1, 4);
		Fracciones f2 = new Fracciones(1, 2);
		Fracciones f3 = new Fracciones();
		Fracciones f4 = new Fracciones(4);
		
		Fracciones suma = f1.sumar(f2);
		Fracciones resta = f1.sumar(f3);
		Fracciones multiplicar = f1.multiplicar(f4);
		Fracciones dividir = f1.division(f2);
		
		//intento de simplificar

		
		System.out.println("Suma de F1: ");
		System.out.println(f1 +" + " +f2+ " = "+suma);
		System.out.println("");
		System.out.println("Resta de F1: ");
		System.out.println(f1 +" - " +f3+ " = "+resta);
		System.out.println("");
		System.out.println("Multiplicar de F1: ");
		System.out.println(f1 +" * " +f4+ " = "+multiplicar);  
		System.out.println("");
		System.out.println("Division de F1: ");
		System.out.println(f1 +" / " +f2+ " = "+dividir); 
		System.out.println("");
		
		//intento simplifica
		
		
		
		
		
		
	}
}
