
public class Main {

	public static void main(String[] args) {
		Tomada t = new Tomada();
		t.setTensao(110);
		t.setPadrao("Tupikunuki");
		
		Tomada t220 = new Tomada();
		t220.setTensao(220);
		t220.setPadrao("tupikinlod");
		
		Geladeira g = new Geladeira();
		g.setTensao(220);
		g.setPadraoDaPlug("tupikaloka");
		System.out.println(g.status());
		System.out.println("Plugar na tomada");
		g.plugarNaTomada(t);
		System.out.println(g.status());
		System.out.println("Desplugar da tomada");
		g.desplugarDaTomada();
		System.out.println(g.status());
		
		//
		
		System.out.println("Plugar na tomada");
		g.plugarNaTomada(t220);
		System.out.println(g.status());

	}

}
