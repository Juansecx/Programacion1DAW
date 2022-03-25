import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a = 0;
		int b = 0;
		int resultado=(int) Math.pow(a, b);
		System.out.println("Introduzca una base:");
		a=sn.nextInt();
		System.out.println("Introduzca ahora un exponente");
		b=sn.nextInt();
		
		do {
			
		System.out.println(resultado);
			
		}while(resultado<=0);
		
	}
}
