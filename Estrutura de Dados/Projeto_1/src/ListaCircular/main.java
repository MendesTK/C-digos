package ListaCircular;

public class main {

	public static void main(String[] args) throws Exception {
		ListaCircular<Integer> lista = new ListaCircular<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		
		
		lista.list();
		
		System.out.println("----");
		
		//lista.listEnd();
		
		lista.remove();
		
		System.out.println("----");
		
		lista.list();
		
		
		
	
		
	}

}
