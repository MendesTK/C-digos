package FilaDinamica;

public class FilaDinamica {

	private Elemento cabeca;
	private Elemento cauda;
	
	public boolean isFull(){
		return false;
	}
	
	public boolean isEmpty(){
		return cabeca == null;
	}
	
	public void add(Object o){
		System.out.println("Adicionando " + o + " a fila.");
		if(cabeca ){
			cabeca = new Elemento(o, cauda)
		}else{
			cauda = new Elemento(o, cauda);
		}
		
	}
	
	public Object remove(){
		
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
		
	}
}
