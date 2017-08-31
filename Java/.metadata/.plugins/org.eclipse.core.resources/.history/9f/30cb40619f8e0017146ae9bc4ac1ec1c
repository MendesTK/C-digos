package interfacesIB;

public class Celular implements Wifi{

	public boolean possuiBluetooth(){
		return true;
	}
	
	private boolean conectadoNoWifi;

	public boolean isConectadoNoWifi() {
		return conectadoNoWifi;
	}

	public void setConectadoNoWifi(boolean conectadoNoWifi) {
		this.conectadoNoWifi = conectadoNoWifi;
	}

	@Override
	public void conectarNoWifi(Modem modem) {
		conectadoNoWifi = true;
		
	}

	@Override
	public void desconectarDoWifi() {
		conectadoNoWifi = false;
		
	}
	
	
}
