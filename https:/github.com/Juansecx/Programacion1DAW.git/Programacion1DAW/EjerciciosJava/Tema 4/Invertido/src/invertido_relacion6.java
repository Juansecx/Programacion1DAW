import java.util.Scanner;
public class invertido_relacion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sn = new Scanner(System.in);
			String frase;
			String invertido= "";
			System.out.println("");
			System.out.print("INTRODUZCA UNA FRASE ALEATORIA: ");
			frase= sn.nextLine();
			System.out.println("");
			
			for (int i=frase.length()-1; i>=0; i--) {
				
				invertido+=frase.charAt(i);

			
	}
			System.out.println("Su frase invertida es: " +invertido);
	
	
		
		
		
	
		
	}
}


	
	
	
