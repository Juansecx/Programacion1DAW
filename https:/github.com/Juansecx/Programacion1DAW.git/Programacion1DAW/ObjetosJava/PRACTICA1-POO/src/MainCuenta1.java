import java.util.Scanner;
public class MainCuenta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String nombre, numero;
		 double tipo, saldo;
		 
		Cuenta prueba = new Cuenta();
		
		System.out.println("");
		System.out.println(" ---------------------");
		System.out.println("  DATOS DEL CLIENTE 1 ");
		System.out.println("");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta: ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes: ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		saldo = sc.nextDouble();
		
		prueba.establece_nombre(nombre);
		prueba.setNum_cuenta(numero);
		prueba.setTipo_interes(tipo);
		prueba.setSaldo(saldo);
		
		System.out.println("");
		System.out.println(" -------------------");
		System.out.println("  DATOS DEL CLIENTE    ");
		System.out.println("");
		System.out.println("Nombre Cliente: " +prueba.dimeNombre());
		System.out.println("Número de Cuenta: " +prueba.getNum_cuenta());
		System.out.println("Tipo Interés: " +prueba.getTipo_interes());
		System.out.println("Saldo: " +prueba.getSaldo());
		System.out.println("");
		
		
		System.out.println(" -------------------");
		System.out.println("  DATOS DEL CLIENTE  2  ");
		System.out.println("");
		
		Cuenta prueba2 = new Cuenta();
		
		prueba2.establece_nombre("Juan Fernadez");
		System.out.println(prueba2.dimeNombre());
		System.out.println("");
		prueba2.establece_nombre("1234567890");
		System.out.println(prueba2.getNum_cuenta());
		System.out.println("");
		prueba2.setTipo_interes(1.75);
		System.out.println(prueba2.getTipo_interes());
		System.out.println("");
		prueba2.setSaldo(300.00);
		System.out.println(prueba2.getSaldo());
		System.out.println("");
		
		Cuenta prueba3 = new Cuenta();
		
		prueba3=prueba;
		System.out.println("");
		System.out.println("Realize un ingreso hacia algunas de las cuentas existentes: ");
		System.out.println("");
		System.out.println("1.- Cuenta 1");
		System.out.println("2.- Cuenta 2");
		System.out.println("3.- Cuenta 3");
		System.out.print(">: ");
		int eleccion = sc.nextInt();
		System.out.println("");
		
		switch (eleccion) {
		
		case 1:
			
			System.out.println("Cuenta  1");
			System.out.println("¿Cuánto deseea ingresar?: ");
			int cuenta1 = sc.nextInt();
			
			System.out.println("La trasferencia ha sido de " +cuenta1+ " euros. " +"Total importado: "+(cuenta1+prueba.getSaldo()));
			break;
		case 2:
			
			System.out.println("Cuenta  2");
			System.out.println("¿Cuánto deseea ingresar?: ");
			int cuenta2 = sc.nextInt();
			
			System.out.println("La trasferencia ha sido de " +cuenta2+ " euros. " +"Total importado: "+(cuenta2+prueba2.getSaldo()));
		
		break;
		case 3:
			
			System.out.println("Cuenta  3");
			System.out.println("¿Cuánto deseea ingresar?: ");
			int cuenta3 = sc.nextInt();
			
			System.out.println("La trasferencia ha sido de " +cuenta3+ " euros. " +"Total importado: "+(cuenta3+prueba.getSaldo())+" euros");
			System.out.println("Cuenta 3: " +(cuenta3+prueba.getSaldo())+" euros");
			System.out.println("Restante Cuenta 2: " +(prueba2.getSaldo() - cuenta3));
			break;
		}
		
		
		
		
		
		

}
}