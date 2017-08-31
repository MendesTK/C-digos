package interfacesIB;

public class Notebook implements Wifi, Bluetooth {

	private boolean conectadoNoWifi;
	private boolean conectadoNoBluetooth;
	
	public boolean isConectadoNoWifi() {
		return conectadoNoWifi;
	}
	public void setConectadoNoWifi(boolean conectadoNoWifi) {
		this.conectadoNoWifi = conectadoNoWifi;
	}
	public boolean isConectadoNoBluetooth() {
		return conectadoNoBluetooth;
	}
	public void setConectadoNoBluetooth(boolean conectadoNoBluetooth) {
		this.conectadoNoBluetooth = conectadoNoBluetooth;
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
	public void conectarNoBluetooth(Celular celular) {
		conectadoNoBluetooth = true;
		
	}
	@Override
	public void desconectarDoBluetooth() {
		conectadoNoBluetooth = false;
		
	}
	
	
}
