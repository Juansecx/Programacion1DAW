import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n;
		int a=0;
		int i;
		
		System.out.print("Introduzca una cantidad:");
		n=sn.nextInt();
		
		for (a=0; a<=n; i++) {
			
			System.out.println("La serie es " +a);
			i=a+=a+1;
			
			
		}
			
			
			
		
		
	}

}
