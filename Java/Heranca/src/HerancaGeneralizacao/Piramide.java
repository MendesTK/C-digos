package HerancaGeneralizacao;

public class Piramide extends Forma {
	
	private double lado;
	private double altura;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume(){
		return (altura * Math.pow(lado, 2))/3;
	}
}
