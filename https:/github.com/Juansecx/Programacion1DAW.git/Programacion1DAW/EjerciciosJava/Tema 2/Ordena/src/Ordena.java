public class Ordena {

	public static int[] tabla = { 4, 3, 6, 8, 8, 4, 1, 9, 5, 7 };

	public static void main(String[] args) {

		int[] res = ordenaTabla(tabla);
		mostrarRes(tabla);
	}

	public static int[] ordenaTabla(int[] tabla) {

		int[] tablaRes = new int[10];
		tablaRes=tabla;
		int aux;
		
		for (int i = 0; i < tablaRes.length - 1; i++) {
			
			for (int j = 0; j< tablaRes.length - i - 1; j++) {
				
				if (tablaRes[j] > tablaRes[j + 1]) {
					aux=tablaRes[j+1];
					tablaRes[j+1]=tablaRes[j];
					tablaRes[j] = aux;
					
				} 
				}
			}
		
		return tablaRes;
}
	public static void mostrarRes(int[] tabla) {
		
		for (int i=0;i<tabla.length;i++       ) {
			System.out.print(tabla[i]+", ");
		}
	}
}
