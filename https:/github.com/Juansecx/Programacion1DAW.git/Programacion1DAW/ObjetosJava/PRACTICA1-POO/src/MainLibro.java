import java.util.Scanner;
public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		Libro libro1 = new Libro("El Quijote", "Cervantes", 1, 0);
		Libro libro2 = new Libro();
		String libro, autor;
		int numEjem, numEjemPrest;
		
		System.out.println("");
		System.out.println(" ------------------");
		System.out.println("  DATOS DEL LIBRO 2 ");
		System.out.println("");
		
		System.out.print("Libro: ");
		libro = sc.nextLine();
		System.out.print("Autor: ");
		autor = sc.nextLine();
		System.out.print("NumeroEjemplar: ");
		numEjem = sc.nextInt();
		System.out.print("NumeroEjemPrestado: ");
		numEjemPrest = sc.nextInt();
		
		
		libro2.setLibro(libro);
		libro2.setAutor(autor);
		libro2.setNumEjem(numEjem);
		libro2.setNumEjemPrest(numEjemPrest);
	
		
		System.out.println("");
		System.out.println(" ------------------");
		System.out.println("  DATOS DEL LIBRO 1 ");
		System.out.println(libro1);
		
		System.out.println("");
		System.out.println(" ------------------");
		System.out.println("  PRESTAMOS ");
		System.out.println("");
		System.out.println("Realizaremos un prestamo al libro 1");
		
		 if(libro1.Prestamo()) {
			 System.out.println("El préstamo se ha realizado correctamente. Quedan " +libro1.getNumEjemPrest() + " ejemplar/es");
		 }else {
			 System.out.println("No se pudo realizar la operación del prestamo");
		 }
		 System.out.println("");
		 System.out.println("Realizaremos otro prestamo al libro 1");
			
		 if(libro1.Prestamo()) {
			 System.out.println("El préstamo se ha realizado correctamente. Quedan " +libro1.getNumEjemPrest() + " ejemplar/es");
		 }else {
			 System.out.println("No se pudo realizar la operación del prestamo debido a la ausencia de libros");
		 }
		 
		 
		 
		
	}

}
