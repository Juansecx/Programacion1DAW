import java.util.Scanner;
public class digitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int iNumero = 0;
		int iCantidad = 0;
		int iTemp = iNumero;
		System.out.println("Introdue un número al azar");
		iNumero=sn.nextInt();
				
		while (iTemp>0){
		  iTemp = iTemp/10;
		  iCantidad++;
		}
				
		System.out.println(iNumero + " tiene " + iTemp + " dígitos");{
		}
	}
}
	         


		
	



