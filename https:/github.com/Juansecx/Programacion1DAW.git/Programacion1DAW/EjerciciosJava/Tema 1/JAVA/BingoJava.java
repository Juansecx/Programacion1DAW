import java.util.Scanner;
public class BingoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		System.out.println("***********************|");
		System.out.println("        |BINGO|        |");
		System.out.println("-----------------------|");
		System.out.println("      -----------");
		System.out.println("      | PREMIOS |     ");
		System.out.println("      -----------");
		System.out.println("LÍNEA: 100$");
		System.out.println("BINGO: 500$");
		System.out.println("");
		System.out.println("Pulse cualquier letra para continuar");
		System.out.print("> "); String a=sn.next();
		
		
		System.out.println("                      JUGADOR 1");

	
		int [ ] [ ] contenedor1=new int [3] [5];
		int ip1=1;
		
		for (int fila=0; fila<3; fila++ ) {  //recorremos la matriz fila
			for (int colum=0; colum<5; colum++ ) { //recorremos la matriz columna
				
				int aleatorio=(int) Math.floor((Math.random()*9+ip1));
				ip1=ip1+10;
				contenedor1[fila][colum]=aleatorio;
				System.out.print(contenedor1[fila][colum]+" " ); 
				
				}
				ip1=1;
				System.out.println(" ");
		}
		
		System.out.println("                      JUGADOR 2");
		
		int [ ] [ ] contenedor2=new int [3] [5];
		int ip2=1;
		
		for (int fila=0; fila<3; fila++ ) { 				 //recorremos la matriz fila
			for (int colum=0; colum<5; colum++ ) { //recorremos la matriz columna
				
				int aleatorio=(int) Math.floor((Math.random()*9+ip2));
				ip2=ip2+10;
				contenedor1[fila][colum]=aleatorio;
				System.out.print(contenedor1[fila][colum]+" " ); 
				
			}
				ip2=1;
				System.out.println(" ");
		}
		System.out.println(" ");
		
		System.out.println("Introduzca cualquier caracter o número para sacar una bola");
		System.out.print("> "); String b=sn.next();
		
		int bola=(int) Math.floor((Math.random()*49+ip1));
		System.out.println(" Ha salido la bola " +bola);
		
		
		for (int fila=0; fila<3; fila++ ) {
			for (int colum=0; colum<5; colum++ ) {
				if(contenedor1[fila][colum]==bola) {
					 System.out.print("Bola encontrada");
				}
				if(contenedor2[fila][colum]==bola) {
					System.out.print("Bola encontrada");
					
				}
				
				}
					
			}
			
		}
			
		
		
		
		
			
		
		
	
		
		
		
		
		
		

	}


