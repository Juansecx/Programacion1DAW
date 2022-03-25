import java.util.Scanner;
public class Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Introduzca 2 números al  azar");
		System.out.print("Primer número: ");
		a=sn.nextInt();
		System.out.print("Segundo número: ");
		b=sn.nextInt();
		
		for (int i=a; i<=b; i+=7) {
			System.out.println(i);
	}

}
}
