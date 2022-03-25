import java.util.Scanner;

public class Ejercicio2 {
	static int b = 1;
	static int dia1 = 15;
	static int mes1 = 3;
	static int anio1 = 2022;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("");
		System.out.println("VEHÍCULO");
		System.out.println("--------");
		int op, nKm, dia, mes, anio;
		String marca, matricula, descripcion, nPropietario, dniPropietario;
		double precio;
		Fecha fMatriculacion;

		Vehiculo coches = new Vehiculo();

		do {

			muestraMenu();
			System.out.println("-----");
			System.out.print("Introduzca una de las opciones: ");
			op = sn.nextInt();


		switch (op) {

		case 1:
			sn.nextLine();
			System.out.println("Vehiculo ");
			System.out.println("---------");
			System.out.print("Marca: ");
			marca = sn.nextLine();
			coches.setMarca(marca);
			
			do {

				System.out.print("Matrícula: ");
				matricula = sn.next();

				if (buenaMatricula(matricula)==false) {

					System.out
							.println("Error al introducir la matricula. La matricula debe contener al menos 8 dígitos");
					System.out.println("");
				}

			} while (!buenaMatricula(matricula));

			coches.setMatricula(matricula);
			System.out.println("Número de Kilómetros: ");
			nKm = sn.nextInt();
			coches.setNumKm(nKm);

			// comporbar que la fecha de matriculacion este bien introducida
			do {
				sn.nextLine();
				System.out.println("Fecha de matriculación: ");
				System.out.print("Dia: ");
				dia = sn.nextInt();
				System.out.print("Mes: ");
				mes = sn.nextInt();
				System.out.print("Año: ");
				anio = sn.nextInt();
				fMatriculacion = new Fecha(dia, mes, anio);
			} while (!fMatriculacion.fechaCorrecta());
			sn.nextLine();
			System.out.print("Descripción: : ");
			descripcion = sn.nextLine();
			coches.setDescripcion(descripcion);
			System.out.print("Precio: ");
			precio = sn.nextDouble();
			coches.setPrecio(precio);
			System.out.print("Nombre del propietario: ");
			nPropietario = sn.next();
			coches.setnPropietario(nPropietario);

			do {
				System.out.println("Dni porpietario: ");
				dniPropietario = sn.next();

				if (!buenDni(dniPropietario)) {
					System.out.println("No se cumple con las especificaciones de un Dni. Vuelva a introducir el dni");
					System.out.println("");
				}
				coches.setDniPropietario(dniPropietario);

			} while (!buenDni(dniPropietario));

			break;
			
		case 2:
			
			coches.toString1();

		case 3:

			coches.toString();

			break;

		case 4:

			int nuevo;
			System.out.println("Número de kilómetros actuales: " + coches.getNumKm());
			System.out.print("Actualizar los kilómetros: ");
			nuevo = sn.nextInt();
			coches.setNumKm(nuevo);

			String numkm = Integer.toString(nuevo);

			if (!numkm.equals("")) {

				int km = Integer.parseInt(numkm);

				// Intento sumar el nuevo valor junto con el antiguo pero no me sale
				coches.setNumKm(km);
			}

			break;

		case 5:

			// Creamos una fecha actual para comprarla con la introduida del vehiculo

			System.out.println("");
			System.out.println("Años de antigüedad del vehiculo: ");
			
			
			
			break;
			
		case 6:
			
			coches.toString2();

		}
		
	} while (op!=9 && op>0 && op<9);
	}
	// Metodo mostrarMenu

	public static void muestraMenu() {

		System.out.println("1. Nuevo Vehículo.");
		System.out.println("2. Ver matrícula.");
		System.out.println("3. Ver número de kilómetros.");
		System.out.println("4. Actualizar Kilómetros.");
		System.out.println("5. Ver años de antigüedad.");
		System.out.println("6. Mostrar propietario.");
		System.out.println("7. Mostrar descripción.");
		System.out.println("8. Mostrar precio.");
		System.out.println("9. Salir.");

	}

	// comprobar matricula
	public static boolean buenaMatricula(String matricula) {

		boolean matricula1;

		if (matricula.length() < 5 || matricula.length() > 5) {

			matricula1 = false;

		}

		return true;

	}

	public static boolean buenDni(String dni) {

		boolean dni1;

		// Intento de querer hacer un charAt para comprobar que alguno de sus digitos
		// contuviera una letra del array "letras"

		// char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
		// 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		if (dni.length() < 0 || dni.length() > 9) {

			dni1 = false;

		}

		return true;

	}
}
