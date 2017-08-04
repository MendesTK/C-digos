package Depen;

public class CarroDAO {

	public Carro obterPeloId(long id){
		Carro p = new Carro();
		p.setPlaca("DEV-6666");
		p.setCidade("Joinville");
		p.setModelo("Carro velho");
		p.setMarca("hot wheels");
		p.setAno(1950);
		p.setCor("Rosa");
		p.setQuilometragem(666);
		p.setValor(666);
		return p;
	}
	
}
