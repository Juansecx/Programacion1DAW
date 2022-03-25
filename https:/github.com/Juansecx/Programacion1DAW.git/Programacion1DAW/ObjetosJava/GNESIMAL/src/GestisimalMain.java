import java.util.Scanner;

public class GestisimalMain {
	static int b =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo articulo1 = new Articulo();
		Scanner sn = new Scanner(System.in);
		
		int op;
		int num = 1;
		int cont=0;
		int primeraLibre;
		Articulo[] art = new Articulo[b];
		boolean salir = false;
		
		
		 for(int i = 0; i < b; i++) {
		     art[i] = new Articulo();
		    }
		do {

			System.out.println("");
			pintaCartel();
			System.out.println("");
			System.out.print("Elija una de las opciones: ");
			op = sn.nextInt();
			switch (op) {

			case 1:

				System.out.println("");
				System.out.println("PRODUCTOS");
				System.out.println("---------");
				System.out.println("");

				for (int i = num; i < b; i++) {
					
					if(!art[i].getCodigo().equals(" ")                   ) {
					System.out.println(art[i]);
				}
			}
				break;

			case 2:
				
					System.out.println("");
					System.out.println("DAR DE ALTA UN PRODUCTO");
					System.out.println("-----------------------");
					
					primeraLibre = -1;
					 do {
				          primeraLibre++;
				          
				        } while (!((art[primeraLibre].getCodigo()).equals(" ")));
					 
						
					System.out.println("Producto " + num);
					System.out.println("");
					System.out.print("Código: ");
					art[primeraLibre].setCodigo(sn.next());
					System.out.print("Descripción: ");
					art[primeraLibre].setDescripcion(sn.next());
					System.out.print("Precio Compra: ");
					art[primeraLibre].setPrecioC(sn.nextInt());
					System.out.print("Precio Venta: ");
					art[primeraLibre].setPrecioV(sn.nextInt());
					
					 
				break;	
				
				}
				

			
			
		} while (salir=true);

	}

	public static void pintaCartel() {

		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");

	}

}
