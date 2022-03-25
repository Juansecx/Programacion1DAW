import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		String nif, nombre, casado;
		int sueldoBase, hExtras, irpf, numHijos, numEmpleado;

		Empleado empleado = new Empleado();

		do {
			System.out.println("");
			System.out.println(" ---------------------");
			System.out.println("  DATOS DEL EMPLEADO ");
			System.out.print("Cantidad de empleados a introducir: ");
			numEmpleado = sn.nextInt();

		} while ((numEmpleado < 1) || (numEmpleado > 20));

		System.out.println("");
		// Creamos el array de objeto

		Empleado[] Array = new Empleado[numEmpleado];

		for (int i = 0; i < Array.length; i++) {

			sn.nextLine();// Limpiar el Scanner

			Array[i] = new Empleado();

			System.out.println("Empleado " + i);
			System.out.println("");
			System.out.print("Nif: ");
			Array[i].setNif(sn.nextLine());
			System.out.print("Nombre: ");
			Array[i].setNombre(sn.nextLine());
			System.out.print("Casado: ");
			Array[i].setCasado(sn.nextLine());
			System.out.print("Sueldo Base: ");
			Array[i].setSueldoBase(sn.nextInt());
			System.out.print("Horas Extras: ");
			Array[i].sethExtras(sn.nextInt());
			System.out.print("IRPF: ");
			Array[i].setIrpf(sn.nextInt());
			System.out.print("Nº hijos: ");
			Array[i].setNumHijos(sn.nextInt());

			// Imprimimos Empleados
			System.out.println("\nEmpleado " + i);
			System.out.println("");
			System.out.println(Array[i]);
			System.out.println("");
		}

		System.out.print("Introduzca la cantidad de importe de horas Extras: ");
		Empleado.setImhExtras(sn.nextDouble());

		// Calculos de metodos y comprobacion del empresario con mayor y menor cobro

		double auxiliar = 0;
		int MayorCobro = 0;
		double auxiliar1 = 50000;
		int menorCobro = 0;

		// mAYORcOBRO
		for (int i = 0; i < Array.length; i++) {

			double dineroTotal = Array[i].calculoBruto() - ((Array[i].calculoIRPF() / 100) * Array[i].calculoBruto());

			if (dineroTotal > auxiliar) {
				auxiliar = dineroTotal;
				MayorCobro = i;
			}

			if (dineroTotal < auxiliar1) {
				auxiliar1 = dineroTotal;
				menorCobro = i;
			}

		}

		System.out.println("\nEl empleado que mayor cobro obtiene es: \n" + Array[MayorCobro]);
		System.out.println("Cobro Total:" + auxiliar + " $");
		System.out.println("El empleado que menor cobro obtiene es: \n" + Array[menorCobro]);
		System.out.println("Cobro Total:" + auxiliar1 + " $");

		System.out.println("\nCOBRO POR HORA EXTRA");
		System.out.println("------------------");

		int hMax = 0;
		int hMin = 500;
	

		for (int i = 0; i < Array.length; i++) {

			if (Array[i].gethExtras() > hMax) {

				hMax = Array[i].gethExtras();
				MayorCobro = i;

				if (Array[i].gethExtras() < hMin) {

					hMin = Array[i].gethExtras();

					menorCobro = i;

				}

			}

		}

		System.out.print("\nEl empleado que mas cobra por horas extras es: \n" + Array[MayorCobro]);
		System.out.print("Con un total de :" + hMax + " horas extras");
		System.out.println("\nEl empleado que menos cobra por hora extra es: \n" + Array[menorCobro]);
		System.out.print("Con un total de :" + hMin + " horas extras  \n" );
		
		
		System.out.println("ORDENAR  EMPLEADOS POR SU SUELDO DE MENOR A MAYOR");
		System.out.println("------------------------------");
		
		
		
		
		
		

	}
}
