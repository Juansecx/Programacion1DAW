import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a = 1;
		int b = 1;
		int resultado=(int) Math.pow(a, b);
		System.out.println("Introduzca una base:");
		a=sn.nextInt();
		System.out.println("Introduzca ahora un exponente");
		b=sn.nextInt();
		
		if (a<0 || b<0) {
			
			System.out.print("La base "+a+ " elevado al exponente " +b+ " es: Error ");
		}
		else {
			System.out.print("La base "+a+ " elevado al exponente " +b+ " es: " +resultado);
		}
		
	}

}
