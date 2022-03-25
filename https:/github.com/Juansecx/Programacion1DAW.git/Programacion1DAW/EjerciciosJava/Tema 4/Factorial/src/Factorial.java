import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num;
		System.out.println("");
		System.out.println("FACTORIAL");
		System.out.println("---------");
		System.out.print("Introduzca un número: ");
		num= sn.nextInt();
		System.out.println("El factorial de "+num+ " es: "+factorial(num));
		
	}
	
	public static int factorial(int numero) {
		
		int aux=numero;
		for (int i=numero;i>1;i--                ) {
			
			numero=numero*(aux-1);
			
			aux=aux-1;
			
			
		
		}
		return numero;
		
	}

}
