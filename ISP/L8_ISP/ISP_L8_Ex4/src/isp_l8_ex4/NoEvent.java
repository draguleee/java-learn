/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;


// Clasa publica NoEvent, care extinde clasa abstracta Event
public class NoEvent extends Event {
	
	// Constructor - fara parametrii
	public NoEvent() {
		super(EventType.NONE);
	}
	
	// Metoda toString()
	public String toString() {
		return "No Event {}";
	}

}
