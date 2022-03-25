import java.util.Scanner;

public class espacios_relacion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String frase;
		int cont = 0;
		System.out.println("");
		System.out.print("INTRODUZCA UNA FRASE ALEATORIA: ");
		frase = sn.nextLine();

		/*for (int i = 0; i<frase.length(); i++) {
			
			 if (frase.charAt(i)==' ')  {
				 

				 cont=cont+1;

			}
			

		}*/
		System.out.print("Su frase tiene " + numEspacio ("Hola me gusta la musica") + " espacios");
		sn.close();
	}
	
	
	public static int numEspacio (String frase ) {
		
		int cont=0;
		
		
		for (int i = 0; i<frase.length(); i++) {
			
			 if (frase.charAt(i)==' ')  {
				 

				 cont=cont+1;

			}
			

		}
		
		
		
		
		return cont;
		
		
	}

}

