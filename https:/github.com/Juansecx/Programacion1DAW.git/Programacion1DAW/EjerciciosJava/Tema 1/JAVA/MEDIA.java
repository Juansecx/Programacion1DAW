import java.util.Scanner;
public class MEDIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduzca dos números");
		System.out.println("1º");
		num1=sn.nextInt();
		System.out.println("2º");
		num2=sn.nextInt();
		
		System.out.println("La media de " +num1+ " y " +num2+ " es: " +(num1+num2)/2);
		
		if(num1<0 || num2<0);{
			System.out.println("Uno de los numeros es negativo, no se puede realizar la media");
			System.out.println("Fin Programa");
		
;		
	}

}
}
