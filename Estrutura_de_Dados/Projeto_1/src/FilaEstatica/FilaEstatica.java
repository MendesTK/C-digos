package FilaEstatica;

public class FilaEstatica {
	
	private Object[] fila;
	private int cabeca;
	private int cauda;
	
	public FilaEstatica(int capacidade){
		fila = new Object[capacidade];
		cabeca = -1;
		cauda = -1;
	}
	
	public boolean isFull(){
		return (cauda+1) % fila.length == cabeca;
	}
	
	public boolean isEmpty(){
		return cabeca == -1;
	}
	
	public void add(Object elemento) throws Exception{
		if(this.isFull()){
			throw new Exception("Fila cheia");
		}
		System.out.println("Adicionando o "+ elemento +" a fila.");
		fila[(cauda+1)%fila.length] = elemento;
		cauda = (cauda+1)%fila.length;
	}
	
	public Object remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("A Fila est� v�zia.");
		}
	}
	
	public void clear(){
		
	}

}