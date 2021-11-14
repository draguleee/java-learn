/*
 * Clasa TV
 */

package isp_l4_rc;

// Clasa publica TV, care modeleaza compozitia
// Compozitia - procesul de construire al unei clase prin adaugarea in cadrul acesteia a unuia sau mai 
// multor atribute de tip referinta (obiecte).
public class TV {
	
	// Atributele / variabilele de instanta ale clasei TV
	RemoteControl rc;
	Display d;
	ElectronicBoard eb;
	boolean state;
	int size;
	
	// Metoda turnOn() - fara parametrii
	// Porneste televizorul
	public void turnOn() {
		System.out.println("Televizor pornit.");
	}
	
	// Metoda turnOff() - fara parametrii
	public void turnOff() {
		System.out.println("Televizor oprit.");
	}

}


// Clasa RemoteControl
class RemoteControl {}

// Clasa Display
class Display {}

// Clasa ElectronicBoard
class ElectronicBoard {}