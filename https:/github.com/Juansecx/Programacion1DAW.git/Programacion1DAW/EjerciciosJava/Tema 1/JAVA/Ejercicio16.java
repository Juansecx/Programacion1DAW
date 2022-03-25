import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n;
		int resultado;
		
		System.out.print("Introduzca un numero al azar: ");
		
		n=sn.nextInt();
		
		if (n%2==0) {
			System.out.println("Su numero es primo");
		}
		
		else {
			System.out.println("Su número no es primo");
		}
		
		
	}

}
