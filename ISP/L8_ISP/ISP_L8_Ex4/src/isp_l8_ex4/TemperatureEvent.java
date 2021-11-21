/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;


// Clasa publica TemperatureEvent, care extinde clasa abstracta Event
public class TemperatureEvent extends Event {
	
	// Atributele / variabilele de instanta pentru clasa Event
	private int value;
	
	// Constructor - parametrii: value (int)
	public TemperatureEvent(int value) {
		super(EventType.FIRE.TEMPERATURE);
		this.value = value;
	}
	
	// Metoda getValue() - fara parametrii
	// Returneaza valoarea evenimentului de temperatura
	public int getValue() {
		return this.value;
	}
	
	// Metoda toString()
	public String toString() {
		return "Temperature Event {value = " + this.value + "}";
	}

}
