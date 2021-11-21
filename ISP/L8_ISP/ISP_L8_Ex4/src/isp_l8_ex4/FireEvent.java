/*
 * Exercitiul 4
 * 
 * Sa se implementeze un simulator de home automation.
 */

package isp_l8_ex4;


// Clasa FireEvent, care extinde clasa abstracta Event
public class FireEvent extends Event {
	
	// Atributele / variabilele de instanta pentru clasa FireEvent
	private boolean smoke;
	
	// Constructor - parametrii: smoke (boolean)
	public FireEvent(boolean smoke) {
		super(EventType.FIRE);
		this.smoke = smoke;
	}
	
	// Metoda isSmoke() - fara parametrii
	// Returneaza valoarea de adevar care atesta prezenta / absenta fumului
	public boolean isSmoke() {
		return this.smoke;
	}
	
	// Metoda toString()
	public String toString() {
		return "Fire Event: {smoke = " + this.smoke + "}";
	}

}
