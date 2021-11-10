/* 
 * Exercitiul 3
 * 
 * Sa se implementeze o aplicatie bazata pe diagrama UML din laborator. Sa se creeze o clasa de test
 * pentru testarea programului.
 * 
 * Sa se urmareasca instructiunile si sa se implementeze programul in acord cu specificatiile.
 */

package isp_l5_ex3;

import java.util.*;

// Clasa abstracta si publica, Sensor
public abstract class Sensor {
	
	// Variabilele de instanta ale clasei
	private String location;
	
	// Metoda abstracta readValue(), care citeste valoarea de pe senzor
	public abstract int readValue();
	
	// Metoda getLocation, care afiseaza locatia senzorului
	public String getLocation() {
		return this.location;
	}
	
}
