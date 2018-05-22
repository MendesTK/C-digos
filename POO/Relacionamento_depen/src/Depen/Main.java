package Depen;

public class Main {

	public static void main(String[] args){
		
		CarroDAO dao = new CarroDAO();
		Carro p = dao.obterPeloId(1);
		CarroView view = new CarroView();
		view.exibir(p);
		
	}
	
}
