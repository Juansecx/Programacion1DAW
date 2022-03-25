package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosMain {

	static Scanner sn = new Scanner(System.in);

	static ArrayList<Empleados> empleados = new ArrayList<Empleados>();

	public static void main(String[] args) {

		int op;
		char resp;
		
		do {

			do {

			System.out.println("");
			System.out.println("EMPLEADOS");
			System.out.println("---------");
			System.out.println("1.- Comercial");
			System.out.println("2.- Repartidor");
			System.out.println("");

			System.out.print("Introduzca una de las opciones: ");
			op = sn.nextInt();

			switch (op) {

			case 1:

				String nombre;
				double salario, comision;
				int nuevo = 1;
				int edad;
				System.out.println("");
				System.out.println("NUEVO COMERCIAL " + nuevo);
				System.out.println("--------------");
				System.out.println("");
				System.out.print("Nombre: ");
				nombre = sn.next();
				System.out.print("Edad: ");
				edad = sn.nextInt();
				System.out.print("Salario: ");
				salario = sn.nextDouble();
				System.out.print("Comision: ");
				comision = sn.nextDouble();
				nuevo++;

				Comercial comercial = new Comercial(nombre, edad, salario, comision);
				comercial.Plus();
				System.out.println("--------------");
				System.out.println("DATOS REGISTRADOS");
				System.out.println("--------------");
				System.out.println(comercial);

				break;

			case 2:

				String nombre1, zona;
				double salario1, comision1;
				int nuevo1 = 1;
				int edad1;
				System.out.println("");
				System.out.println("NUEVO REPARTIDOR " + nuevo1);
				System.out.println("--------------");
				System.out.println("");
				System.out.print("Nombre: ");
				nombre1 = sn.next();
				System.out.print("Edad: ");
				edad1 = sn.nextInt();
				System.out.print("Salario: ");
				salario1 = sn.nextDouble();
				System.out.print("Comision: ");
				comision1 = sn.nextDouble();
				System.out.println("Zona: ");
				zona = sn.next();
				nuevo1++;

				Repartidor repartidor = new Repartidor(nombre1, edad1, salario1, zona);
				repartidor.Plus(edad1, salario1, zona);
				System.out.println("--------------");
				System.out.println("DATOS REGISTRADOS");
				System.out.println("--------------");
				System.out.println(repartidor);

				break;

			}
			
			System.out.print("Desea introducir otro empleado(s/n): ");
			resp = sn.next().charAt(0);

		} while (op < 1 || op > 2);
			
		}while (resp=='s' || resp=='S');
	}

}
