/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;


// Clasa publica si abstracta Event
public class Event {
	
	// Atributele / variabilele de instanta pentru clasa Event
	EventType type;
	
	// Constructor - parametrii: type (EventType)
	public Event(EventType type) {
		this.type = type;
	}
	
	// Metoda getType() - fara parametrii
	// Returneaza tipul evenimentului
	public EventType getType() {
		return this.type;
	}

}
