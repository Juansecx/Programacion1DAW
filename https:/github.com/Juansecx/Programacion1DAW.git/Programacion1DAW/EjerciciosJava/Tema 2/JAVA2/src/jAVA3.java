import java.util.Scanner;

public class jAVA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 int n; // Cuenta
		 int x; // Múltiplo
		 int i; // Contador

		System.out.print("¿De qué número quieres los múltiplos?: ");
		 x = sc.nextInt();

		System.out.print("¿Hasta qué número quieres la lista?: ");
		 n = sc.nextInt();

		for (i=1; i <=n; i++) {

		if (i % x == 0)
		 System.out.println(i);

		   }

		}
	}

