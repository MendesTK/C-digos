package ListaCircular;

public class main {

	public static void main(String[] args) throws Exception {
		ListaCircular lista = new ListaCircular();
		
		lista.add(1);
		lista.add(2);
		
		//lista.addFirst("a");
		//lista.addFirst("b");
		
		
		
		lista.list();
		
		System.out.println("----");
		
		lista.listEnd();
		
		lista.removeLast();
		
		lista.list();
		
		lista.removeLast();
		lista.removeLast();
		
	}

}
