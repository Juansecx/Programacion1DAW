import java.util.Scanner;
public class Hitler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		   System.out.println("Cálculo de una potencia");
		    
		    System.out.print("Introduzca la base: ");
		    int base = sn.nextInt();
		    
		    System.out.print("Introduzca el exponente: ");
		    int exponente = sn.nextInt();

		    double potencia = 1;
		        
		    if (exponente == 0) {
		      potencia = 1;
		    }
		    
		    if (exponente > 0) {
		      for (int i = 0; i < exponente; i++) {
		        potencia *= base;
		      }
		    }
		    
		    if (exponente < 0) {
		      for (int i = 0; i < -exponente; i++) {
		        potencia *= base;
		      }
		      
		      potencia = 1/potencia;
		    }

		    System.out.println(base + "^" + exponente + " = " + potencia);

		  }
		  
		}