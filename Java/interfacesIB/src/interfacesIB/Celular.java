package interfacesIB;

public class Celular implements Wifi, Bluetooth{

	
	public boolean conectadoNoWifi(){
		return true;
	}
	public boolean possuiBluetooth(){
		return true;
	}
	

	private boolean conectadoNoWifi;
	private boolean conectadoNoBluetooth;
	
	public boolean isConectadoNoBluetooth() {
		return conectadoNoBluetooth;
	}
	public void setConectadoNoBluetooth(boolean conectadoNoBluetooth) {
		this.conectadoNoBluetooth = conectadoNoBluetooth;
	}
	

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

	@Override
	public void conectarNoBluetooth(RedeB redeB) {
		conectadoNoBluetooth = true;
		
	}

	@Override
	public void desconectarDoBluetooth() {
		conectadoNoBluetooth = false;
		
	}
	
	
}
