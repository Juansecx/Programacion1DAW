import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int n=sn.nextInt();
		int i;
		int suma=100+n;
		for (i=n;i<=suma ;i++) {
			
		suma=suma+i;
		
		
		
			
		}
		
		System.out.print("La suma de los numeros consecutivos es: " +suma);
	}

}
