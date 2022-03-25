import java.util.Scanner;
public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduzca un numero al azar");
		num=sn.nextInt();
		System.out.println("El cuadrado de los numeros que has introducidos son:");
		System.out.println(num^2);
	}
}
