
import java.util.Scanner;
public class piramideTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.print("Introduzca la altura del triángulo: ");
		int altura=s1.nextInt();
		System.out.print("Introduzca el caracter del triángulo: ");
		String caracter=s2.nextLine();
		
		int base=1;
		int longitud=1;
		int espacio=altura-1;
		
		while (base<=altura) {
			
			for (int i=1; i<=espacio; i++) {
				
				System.out.print(" ");
			}
			
			for (int i=1; i<=longitud; i++) {
				System.out.print(caracter);
			}
			
			System.out.println();
			
			base++;
			espacio -- ;
			longitud+=2;
			s1.close();
			s2.close();
			
			
				
			
			
			}
			
		}
			
	}
			
			
		
	}


