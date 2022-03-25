import java.util.Scanner;
public class Relacion5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		int bin;
		System.out.println("");
		System.out.print("Introduzca un número binario al azar: ");
		bin=sn.nextInt();
		System.out.println("");
		System.out.println(bin + " tiene " + MATES.funcionesmatematicas.digito(bin) + " dígitos.");
		System.out.println("");
		
		
		
		if (bin>0) {
			
			String binString = Integer.toString(bin);
			int decimal=binString.charAt(0);
			int suma = (int) Math.pow(decimal,MATES.funcionesmatematicas.digito(bin));
			System.out.println("Decima:" +decimal);
		}
	
		
	
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		

	


