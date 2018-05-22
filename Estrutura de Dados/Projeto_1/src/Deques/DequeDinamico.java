package Deques;


public class DequeDinamico {
	
	private Elemento cabeca;
	private Elemento cauda;
	
	public DequeDinamico() {
		cabeca = cauda = null;
	}
	
	public boolean isFull(){
		return false;
	}
	
	public boolean isEmpty(){
		return cabeca == null && cauda == null;
	}
	
	public void add(Object valor) throws Exception{
		System.out.println("Adicionando " + valor + " ao deque.");
		Elemento e = new Elemento(valor);
		if(cauda != null){
			cauda.setProximo(e);
		}
		cauda = e;
		if(cabeca == null){
			cabeca = e;
		}
		
	}
	
	public void addFirst(Object valor) throws Exception{
		System.out.println("Adicionando " + valor + " ao deque.");
		Elemento e = new Elemento(valor);
		if(cabeca != null){
			cabeca.setAnterior(e);
		}
		cabeca = e;
		if(cauda == null){
			cauda = e;
		}
		
	}
	
	
	
	public Object removeLast() throws Exception{
		
	}
	
	public Object remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("Deque vazio.");
		}
		Object o = cabeca.getValor();
		cabeca = cabeca.getProximo();
		if(cabeca == null){
			cauda = null;
		}
		System.out.println("Removendo o "+ o +" do deque.");
		
		return o;
	}
	
	public void clear(){
		while(!this.isEmpty()){
			try{
				this.remove();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void list(){
		Elemento e = cabeca;
		
		while(e != null){
			System.out.println("Valor "+ e.getValor());
			e = e.getProximo();
		}
		
	}
	
	

}
