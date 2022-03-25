package funciones;

import java.util.Scanner;

public class funcionesMatematicas {

	public static boolean esPrimo(int numero) {

		int contador = 0;
		for (int i = 1; i <= numero; i++)

		{
			if ((numero % i) == 0)

			{
				contador++;

			}
		}

		if (contador <= 2)

		{
			return true;

		} else {
			return false;

		}

	}

	public static int potencia(int base, int potencia) {

		int resultado = (int) Math.pow(base, potencia);

		return resultado;

	}

	public static int digito(int x) {

		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10;
				n++;
			}
			return n;
		}

	}

	public static int voltear(int x) {

		int invertido = 0, resto;

		while (x > 0) {
			resto = x % 10;
			invertido = invertido * 10 + resto;
			x /= 10;
		}
		return invertido;
		
	}

	public static int posicionD(int x, int b) {

		// Le damos la vuelta al número introducido

		int aux = voltear(x);
		int pos = 0;

		while (aux > 0) {
			pos++;
			int resto = aux % 10;
			aux = aux / 10;

			if (resto == b) {

				return pos;

			}

		}

		return -1;
	}
	
	




	public static boolean esCapicua (int num) {
		
		return num==invertirNumero(num);
		
	
	}
	private static int invertirNumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10;
            inverso = cifra + inverso * 10; 
            num /= 10;
        }
        return inverso;
    }
}


