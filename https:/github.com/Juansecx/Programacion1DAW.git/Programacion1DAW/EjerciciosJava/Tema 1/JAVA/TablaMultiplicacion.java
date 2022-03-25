import java.util.Scanner;
public class España {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int operando;
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduzca un numero al azar");
		num=sn.nextInt();
		
		System.out.println("La tabla del numero " + num + " es:");
		for(operando=1; operando<=10;operando++) {
		System.out.println(num+"*"+(operando)+"="+(operando*num));
		}
	}

}
