package Deques;

public class main {

	public static void main(String[] args) throws Exception {
		
		DequeDinamico deque = new DequeDinamico();
		
		deque.add(1);
		deque.add(2);
		
		deque.list();
		
		deque.addFirst(3);
		deque.addFirst(4);
		
		deque.list();
		
		deque.listEnd();

	}

}
