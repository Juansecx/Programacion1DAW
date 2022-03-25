
import java.util.Random;
import java.util.Scanner;

public class Relacion3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Pulse cualquier caracter para mostrar una carta al azar de la baraja española");
		System.out.print("> ");
		String caracter=sn.next();
		int numeros=(int) Math.floor(Math.random()*12+1);
		String [] ejemplo= { "oros", "copas", "espadas"};
		Random palabras=new Random();
		int p =palabras.nextInt(3);
		String z=ejemplo[p];
		
		if (numeros==0) {
			System.out.println("No existe carta que tenga valor 0");
		}
		if (numeros==1) {
				System.out.println("La carta saliente es el: As");
			}
	
		if (numeros>1 && numeros<=7) {
				System.out.println("La carta saliente es: " +numeros+ " de " +z);
			}
		if (numeros==10) {
			System.out.println("La carta saliente es la: Sota ");
			}
		if (numeros==11) {
			System.out.println("La carta saliente es el: Caballero/Caballo");
		}
		if (numeros==12) {
			System.out.println("La carta saliente es el: Rey");
		}
			
		}
		
		
	}


