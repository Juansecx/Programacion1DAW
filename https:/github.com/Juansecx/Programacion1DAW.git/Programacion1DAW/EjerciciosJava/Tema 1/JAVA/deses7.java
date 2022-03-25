import java.util.Scanner;
public class deses7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int resp = 0;
		int pullo=1234;
		for (int i=1;i<5;i++) {
			System.out.println("Introduzca la clave de acceso");
			resp=sn.nextInt();
			while(resp>9999 || resp<999){
				System.out.println("El numero introducido es inválido");
				resp=sn.nextInt();
				
				
			}
			
			if(resp==pullo) {
				
				i=5;
			}
			System.out.println("Intento fallido, vuelve a tu puta casa cerdo");
			
			
		}
		
		if(resp != pullo) {
			System.out.println("Eres un pringao, nunca conseguirás acceder a la caja fuerte, cerdo");
		}else {System.out.println("Caja fuerte desbloqueada");}
		
	}

}
