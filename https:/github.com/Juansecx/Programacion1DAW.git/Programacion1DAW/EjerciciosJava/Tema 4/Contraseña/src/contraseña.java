import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String contra;
		String contra2;
		int version;
			System.out.println("VERSION 1");
			System.out.println("");
			System.out.println("JUGADOR1");
			System.out.println("");
			System.out.print("INTRODUZCA SU CONTRASEÑA: ");
			contra = sn.nextLine();
			System.out.println("");
			
			
			do {
			System.out.println("");
			System.out.println("TURNO DEL JUGADOR 2");
			System.out.println("");
			System.out.print("ADIVINA LA CONTRASEÑA: ");
			contra2 = sn.nextLine();
			
			if (contra.equalsIgnoreCase(contra2)) {
				
				System.out.println("");
				System.out.println("Has acertado la contraseña, enhorabuena");
				
			}else {
				
				int ultimo = contra.length();
				System.out.println("");
				System.out.println("No has acertado vuelva a repetir la contraseña");
				System.out.println("");
				System.out.println("Nº caracteres: "+contra.length());
				System.out.println("1º caracter: " +contra.charAt(0));
				System.out.println("Ultimo caracter: " +contra.charAt(ultimo -1 ));
			}
				
				
				
			}while (!contra.equalsIgnoreCase(contra2));
			
			System.out.println("");
		 	System.out.println("VERSION 2");
			
			System.out.println("");
			System.out.println("JUGADOR1");
			System.out.println("");
			System.out.print("INTRODUZCA SU CONTRASEÑA: ");
			contra = sn.nextLine();
			System.out.println("");
			
			
			do {
			System.out.println("");
			System.out.println("TURNO DEL JUGADOR 2");
			System.out.println("");
			System.out.print("ADIVINA LA CONTRASEÑA: ");
			contra2 = sn.nextLine();
			
			if (contra.equalsIgnoreCase(contra2)) {
				
				System.out.println("");
				System.out.println("Has acertado la contraseña, enhorabuena");
				
			}else {
				
				if (contra2.length() > contra.length()   ) {
					System.out.println("Su contraseña introducida tiene más caracteres que la contraseña principal ");
					System.out.println("");
					System.out.println("No has acertado vuelva a repetir la contraseña");
					System.out.println("");
					
				}
				
				
				
				
			}
				
				
				
			}while (!contra.equalsIgnoreCase(contra2));
			
			
		}
		
		
		
			
			
			
		
		
		
		
		

	}



