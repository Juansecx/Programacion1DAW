
public class MainCont3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 Ejercicio3 cont1= new Ejercicio3();
		 //Añadimos al cont un valor
		 cont1.setCont(4);
		 System.out.print("EL CONTADOR TIENE UN VALOR DE: ");
		 System.out.println(cont1.getCont());
		 //Incrementamos el cont
		 cont1.Incrementar();
		 System.out.print("EL CONTADOR INCREMENTADO ES: ");
		 System.out.println(cont1.getCont());
		 //Mostramos el valor actual del cont
		 System.out.print("EL VALOR INCREMENTADO DOS VECES ES:");
		 cont1.Incrementar();
		 cont1.Incrementar();
		 System.out.println(cont1.getCont());
		 //restamos 1 al contador atraves de la funcion decrementar
		 System.out.print("EL CONTADOR DECREMENTADO POR 1 ES:");
		 cont1.Decrementar();
		 System.out.println(cont1.getCont());
		 System.out.println("");
		 System.out.println("NUEVO CONTADOR 2");
		 System.out.println("-------------");
		 
		 Ejercicio3 cont2 = new Ejercicio3(cont1);
		 cont2.setCont(10);
		 System.out.print("EL NUEVO CONTADOR INCREMENTADO ES:");
		 cont2.Incrementar();
		 System.out.println(cont2.getCont());
		 System.out.print("EL NUEVO CONTADOR DECREMENTADO ES:");
		 cont2.Decrementar();
		 System.out.println(cont2.getCont());
		 System.out.println("");
		 System.out.println("NUEVO CONTADOR 3");
		 System.out.println("---------------");
		 Ejercicio3 cont3 = new Ejercicio3(cont2);
		 System.out.print("VALOR CONT 3:");
		 System.out.println(cont3.getCont());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
