
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de euros a convertir en pesetas: ");
		double euro1=sn.nextDouble();
		double conversor=euro1*166;
		System.out.println("La cantidad de euros introducidos son: " +conversor+ " pesetas");
	}

}
