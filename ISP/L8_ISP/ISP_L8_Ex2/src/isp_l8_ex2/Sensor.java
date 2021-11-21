/*
 * Exercitiul 2
 * 
 * Sa se creeze diagrama UML pentru clasa Sensor
 */

package isp_l8_ex2;


// Clasa publica abstracta Sensor
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
