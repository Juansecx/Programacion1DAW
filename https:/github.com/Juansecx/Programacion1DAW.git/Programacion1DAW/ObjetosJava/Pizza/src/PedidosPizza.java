
public class PedidosPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Pizza p1 = new Pizza("Margarita","Mediana");
	 Pizza p2 = new Pizza("Fughi","Familiar");
	 p2.Sirve();
	 Pizza p3 = new Pizza("Cuatro Quesos","Mediana");
	 System.out.println(p1);
	 System.out.println(p2);
	 System.out.println(p3);
	 p2.Sirve();
	 System.out.println("Pedidas: " +Pizza.getTotalPedidas());
	 System.out.println("Servidas: " +Pizza.getTotalServidas());
	}

}
