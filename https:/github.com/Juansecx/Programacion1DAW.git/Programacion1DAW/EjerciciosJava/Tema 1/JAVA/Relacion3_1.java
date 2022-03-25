import java.util.Scanner;
public class Relacion3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Pulsa cualquier caracter  para lanzar el 1º dado");
		System.out.print("> ");
		String dado1 = sn.next();
		int tirada1 = (int) Math.floor((Math.random() * 6+1 ));
		System.out.println("");
		System.out.println("El la primera tirada ha salido un: "+tirada1);
		System.out.println("");
		System.out.println("Pulsa cualquier caracter  para lanzar el 2º dado");
		System.out.print("> ");
		String dado2 = sn.next();
		int tirada2 = (int) Math.floor((Math.random() * 6+1 ));
		System.out.println("");
		System.out.println("El la segunda tirada ha salido un: "+tirada2);
		System.out.println("");
		System.out.println("Pulsa cualquier caracter  para lanzar el 3º dado");
		System.out.print("> ");
		String dado3 = sn.next();
		int tirada3 = (int) Math.floor((Math.random() * 6+1 ));
		System.out.println("");
		System.out.println("El la tercera tirada ha salido un: "+tirada3);
		int suma=tirada1+tirada2+tirada3;
		System.out.println("");
		System.out.println("La suma de las 3 tiradas es de: " +tirada1+ "+" +tirada2+ "+" +tirada3+ " = " +suma);
		
		
		
		
		
	}

}
