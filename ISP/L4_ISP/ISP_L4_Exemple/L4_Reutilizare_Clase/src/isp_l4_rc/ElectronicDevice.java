/*
 * Clasa ElectronicDevice
 */

package isp_l4_rc;


// Clasa publica ElectronicDevice, care modeleaza procesul / conceptul de mostenire
public class ElectronicDevice {
	
	// Atributele / variabilele de instanta ale clasei ElectronicDevice
	private boolean powered;
	
	// Constructor - fara argumente
	public ElectronicDevice() {
		this.powered = false;
	}
	
	// Metoda turnOn() - fara parametrii
	// Porneste dispozitivul electronic
	protected void turnOn() {
		System.out.println("Device is turned ON.");
		this.powered = true;
	}
	
	// Metoda turnOff() - fara parametrii
	// Opreste dispozitivul electronic
	protected void turnOff() {
		System.out.println("Device is turned OFF.");
		this.powered = false;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unor dispozitive electronice (obiecte de tip ElectronicDevice)
		ElectronicDevice ed1 = new ElectronicDevice();
		ElectronicDevice ed2 = new TVS();
		TVS ed3 = new TVS();
		
		// Operare cu ed1
		ed1.turnOff();
		ed1.turnOn();
		
		// Operare cu ed2
		System.out.println();
		ed2.turnOff();
		ed2.turnOn();
	
		// Operare cu ed3
		System.out.println();
		ed3.turnOff();
		ed3.turnOn();
		ed3.channelUp();
		ed3.channelDown();
	}

}


// Clasa TV, care extinde / mosteneste clasa ElectronicDevice
class TVS extends ElectronicDevice {
	
	// Atributele / variabilele de instanta ale clasei TV
	public int channel;
	
	// Metoda channelUp() - fara parametrii
	// Schimba canalul cu un numar mai mare decat canalul de la care s-a schimbat
	public void channelUp() {
		if(channel <= 10) {
			channel++;
			System.out.println("Channel up " + this.channel);
		}
	}
	
	// Metoda channelDown() - fara parametrii
	// Schimba canalul cu un numar mai mic decat canalul de la care s-a schimbat
	public void channelDown() {
		if(channel >= 2) {
			channel--;
			System.out.println("Channel down " + this.channel);
		}
	}
}
